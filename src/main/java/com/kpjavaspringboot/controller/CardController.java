package com.kpjavaspringboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CardController {
		
    @RequestMapping(value = { "/Shiva123" }, method = RequestMethod.GET)
    public String retrieveShiva() {
    	System.out.println("KP : @Controller : CardController - @RequestMapping : retrieveCity");
		System.out.println("KP : KPJavaSpringBootApplication - @RestController : CardController - @GetMapping");
		return "HTTP://GET : RETRIEVE : Sri Sita Rama Hanuman : SHIVAIVIAVAAV";	
	}
	
    @RequestMapping(value = { "/shiva1234" }, method = RequestMethod.GET)
    public String retrieveShiva2() {
        
		System.out.println("KP : KPJavaSpringBootApplication - @RestController : CardController - @GetMapping");
		return "HTTP://GET : RETRIEVE : Sri Sita Rama Hanuman : SHIVAIVIAVAAV";	
    }
	
	public void Welcome(String name) {
		System.out.println("\t An Abstract Class Card implements Regular Method Card Number : " + name);
	}
	
		
	public void getProfile() {
		
		class MasterProfile extends Profile {

			@Override
			public void Square() {
				// TODO Auto-generated method stub
				
			}
		}
	}
	
	interface Shape {
		
		public void Square(); // interface method (does not have a body)

		public void Circle(); // interface method (does not have a body)
		
	}
	
	
	abstract class Profile implements Shape{
		
		public void Sqaure() {
			System.out.println("\t My Profile is Square");								
		}
		
		public void Circle() {
			System.out.println("\t My Profile is Square");			
		}
		
	}
	
	}
	
