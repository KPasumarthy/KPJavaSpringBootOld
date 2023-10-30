package com.kpjavaspringboot.scheduler;

import com.kpjavaspringboot.KPJavaSpringBootApplication;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@Slf4j
public class KPJavaScheduler {

    private static Logger logger = LoggerFactory.getLogger(KPJavaSpringBootApplication.class);
    private static int corePoolSize = 3;
    private static int initialDelay = 5;
    private static int period = 7;


    public static void main(String[] args) {
        ///System.out.println("KP : KPJavaScheduler : ScheduledExecutorService ");
        logger.info("KP : KPJavaScheduler ScheduledExecutorService ");

        beepForAnHour();
    }
    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(corePoolSize);
    // ScheduledExecutorService created with 3 threads

    @SuppressWarnings("rawtypes")
    public static void beepForAnHour() {

        final Runnable beeper = new Runnable() {
            public void run() {
                ///System.out.println("beep :: " + new Date() ); }
                logger.info("beep :: " + new Date() ); }

        }; // Creating a new runnable task which will be passed as an argument to scheduler

        ScheduledFuture beeperHandleAtFixedRate = scheduler.scheduleAtFixedRate(beeper, initialDelay, period, TimeUnit.SECONDS);
        // Creates and executes a ScheduledFuture that becomes enabled after 5 seconds and gets executed with fixed rate of 5 seconds

        ScheduledFuture beeperHandleArFixedDelay = scheduler.scheduleWithFixedDelay(beeper, initialDelay, period, TimeUnit.SECONDS);
        // Creates and executes a ScheduledFuture that becomes enabled after 5 seconds and gets executed with fixed delay of 5 seconds

        scheduler.schedule(new Runnable() {
            public void run() { beeperHandleAtFixedRate.cancel(true); } // Attempts to cancel execution of task beeperHandleAtFixedRate after one hour
        }, 60 * 60, TimeUnit.SECONDS); // Creates and executes a one-shot action that becomes enabled after the given delay.

        scheduler.schedule(new Runnable() {
            public void run() { beeperHandleArFixedDelay.cancel(true); } // Attempts to cancel execution of task beeperHandleArFixedDelay after one hour
        }, 60 * 60, TimeUnit.SECONDS);
    }

}