package com.mail.ty;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.ImageHtmlEmail;
import org.apache.commons.mail.resolver.DataSourceUrlResolver;

public class SendingHTMLformattedEmail {

	public static void main(String[] args) throws EmailException, MalformedURLException {

		String hostName = "smtp.gmail.com";
		int port = 465;
		String userName = "shobhanks2016@gmail.com";
		String password = "LAVAirisx1";
		String emailFrom = "shobhanks2016@gmail.com";
		String emailTo = "shobhanks2016@gmail.com";
		String emailCc = "shobhanks2016@gmail.com";
		String emailBcc = "shobhanks2016@gmail.com";
		String aSubject = "Hi .. This is mail ";
		String msg = "Your email client does not support HTML messages";

		System.out.println("Email initialzed ...");

		// load your HTML email template
	//	String htmlEmailTemplate = ".... <img src=\"http://www.apache.org/images/feather.gif\"> ....";
		
		
		String htmlEmailTemplate =".... <img src=\"https://commons.apache.org/proper/commons-email/images/email-logo-white.png\">....";
		// define you base URL to resolve relative resource locations
		URL url = new URL("http://www.apache.org");

		// create the email message
		ImageHtmlEmail email = new ImageHtmlEmail();
		email.setDataSourceResolver(new DataSourceUrlResolver(url));
		email.setHostName(hostName);
		email.setSmtpPort(port);
		email.setSSLOnConnect(true);
		email.setAuthentication(userName, password);
		email.setFrom(emailFrom);
		email.addTo(emailTo);
		email.addCc(emailCc);
		email.addBcc(emailBcc);
		email.setSubject(aSubject);

		// set the html message
		email.setHtmlMsg(htmlEmailTemplate);
		// set the alternative message
		email.setTextMsg(msg);
	//	email.setMsg(msg);

		System.out.println("Sending...!!");
		email.send();
		System.out.println("Email Sent Successfully!!");
	}
}