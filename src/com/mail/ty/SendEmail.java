package com.mail.ty;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {

	public static void main(String[] args) throws EmailException {

		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);

		String username = "shobhanks2016@gmail.com";
		String password = "LAVAirisx1";
		email.setAuthenticator(new DefaultAuthenticator(username, password));
		email.setSSLOnConnect(true);
		email.setFrom("shobhanks2016@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("shobhanks2016@gmail.com");
		email.send();
		System.out.println("email sent successful");
	}
}