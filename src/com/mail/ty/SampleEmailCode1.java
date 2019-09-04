package com.mail.ty;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SampleEmailCode1 {

	public static void main(String[] args) throws EmailException {

		Email email = new SimpleEmail();
		String userName = "shobhanks2016@gmail.com";
		String password = "LAVAirisx1";
		String emailFrom = "shobhanks2016@gmail.com";
		String emailTo = "shobhanks2016@gmail.com";
		String emailCc = "shobhanks2016@gmail.com";
		String emailBcc = "shobhanks2016@gmail.com";
		;
		String aSubject = "Hi .. This is mail ";
		String msg = "Hi XYZ!"
				+ "\r\n" 
				+ "\r\n" 
				+"Hope this mail finds you in the best of your time."
				+ "\r\n" 
				+ "I am very happy to invite you to my birthday party on Nov 03 at ABC Hotel from 7:00 pm to 10:00 pm."
				+ "\r\n" 
				+ "The theme of the birthday party is ‘Pirate of the Caribbean”."
				+ "\r\n" 
				+ "It would be great if you come and join us at the party. We will have a great time and fun together."
				+ "\r\n" 
				+ "\r\n" 
				+ "See You Soon"
				+ "\r\n" 
				+ "\r\n" 
				+ "Thanks and Regards" 
				+ "\r\n" 
				+ "Shobhan K S" 
				+ "\r\n" 
				+ "QA Engineer"
				+ "\r\n" 
				+ "Bangalore";
		
		String hostName = "smtp.gmail.com";
		int port = 465;

		System.out.println("Email initialzed ...");
		email.setHostName(hostName);
		email.setSmtpPort(port);
		email.setSSLOnConnect(true);
		email.setAuthentication(userName, password);
		email.setFrom(emailFrom);
		email.addTo(emailTo);
		email.addCc(emailCc);
		email.addBcc(emailBcc);
		email.setSubject(aSubject);
		email.setMsg(msg);
		System.out.println("Sending...!!");
		email.send();
		System.out.println("Email Sent Successfully!!");
	}
}