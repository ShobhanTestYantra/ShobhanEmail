package com.mail.ty;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

public class SendHTMLEmbeddedImg {
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
		HtmlEmail email = new HtmlEmail();
		email.setHostName(hostName);
		email.setSmtpPort(port);
		email.setSSLOnConnect(true);
		email.setAuthentication(userName, password);
		email.setFrom(emailFrom);
		email.addTo(emailTo);
		email.addCc(emailCc);
		email.addBcc(emailBcc);
		email.setSubject(aSubject);
	//	email.setMsg(msg);
	
		// embed the image and get the content id
		URL url = new URL("http://www.apache.org/images/asf_logo_wide.gif");
		String cid = email.embed(url, "Apache logo");

		// set the html message
		email.setHtmlMsg("<html>The apache logo - <img src=\"cid:" + cid + "\"></html>");

		// set the alternative message
		email.setTextMsg("Your email client does not support HTML messages");

		System.out.println("Sending...!!");
		email.send();
		System.out.println("Email Sent Successfully!!");

	}

}
