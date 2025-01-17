package com.kpjavaspringboot.smtp;

import java.io.File;
import java.io.IOException;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kpjavaspringboot.KPJavaSpringBootApplication;

import javax.activation.*;



public class KPSendEmail {

	private static Logger logger = LoggerFactory.getLogger(KPJavaSpringBootApplication.class);
	
	public KPSendEmail() {
		 // //TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {

		////KP : Enable SMTP Settings on KPSendGmail
		//https://www.google.com/settings/security/lesssecureapps : Allow less secure apps: Enable ON
		//https://accounts.google.com/DisplayUnlockCaptcha : Continue
		
				
		// Recipient's email ID needs to be mentioned.
		String to = "KPXYZ@ReceipentsEmail.com";

		// Sender's email ID needs to be mentioned
		final String from = "KPXYZ@SendersEmail.com";
		
		//Password for 'from' address : "KPXYZ@SendersEmail.com";
		final String password = "password";
		
		// Assuming you are sending email from localhost
		String host = "localhost";

		//	// Get System & Set Properties : Properties properties = System.getProperties(); 
		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "465");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.socketFactory.port", "465");
		prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		
		//	//Session Object
		Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, password);
			}			
		});

		try {
			// Create a default MimeMessage object.
			MimeMessage message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(from));

			// Set To: header field of the header.
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			// Set Subject: header field
			message.setSubject("KP : Java SMTP Mail : This is the Subject Line!");

			// Now set the actual message
			String msg =	"Hi Kailash, "
						 + "This is actual message, sent as an SMTP Mail from inside Java SMTP Program"
						 + "Thanks, Kailash";

			// MIME Attachment Part
			MimeBodyPart mimeBodyPart = new MimeBodyPart();
			mimeBodyPart.setContent(msg, "text/html");
			
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(mimeBodyPart);
			
			File file = new File("C:\\Users\\admin\\eclipse-workspace\\KPJavaSpringBoot\\src\\main\\WebApp\\images\\KPFile.jpeg");
			MimeBodyPart attachment = new MimeBodyPart();
			attachment.attachFile(file);
			multipart.addBodyPart(attachment);
			message.setContent(multipart);
			
			// Send message
			Transport.send(message);
			
			//Logging
			System.out.println("KP : Sent Message Successfully!...");
			logger.info("KP : KPJavaSpringBootApplication : KPSendEmail - SMTP Sent Message Successfully!");
			
			
		} catch (MessagingException mex) {
			//Logging
			System.out.println("KP : Send Message Failure....");
			logger.error("KP : KPJavaSpringBootApplication : KPSendEmail - SMTP Send Message Failure...!");
			logger.error("KP : KPJavaSpringBootApplication : KPSendEmail - SMTP Send Message Failure", mex);
			mex.printStackTrace();
		}
	}

}