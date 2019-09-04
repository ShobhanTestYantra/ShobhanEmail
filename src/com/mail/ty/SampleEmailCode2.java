package com.mail.ty;

import java.io.File;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class SampleEmailCode2 {

	public static void main(String[] args) throws EmailException {

		String hostName = "smtp.gmail.com";
		int port = 465;
		String userName = "shobhanks2016@gmail.com";
		String password = "LAVAirisx1";
		String emailFrom = "shobhanks2016@gmail.com";
		String emailTo = "shobhanks2016@gmail.com";
		String emailCc = "shobhanks2016@gmail.com";
		String emailBcc = "shobhanks2016@gmail.com";
		String aSubject = "Hi .. This is mail ";
		String msg = "Here is the Xlsx you wanted";
		
		
		// Create the attachment
		EmailAttachment attachment = new EmailAttachment();
		attachment.setPath("./DATA/inputdata.xlsx");
		attachment.setDisposition(EmailAttachment.ATTACHMENT);
		attachment.setDescription("xlsx file to test");
		attachment.setName("FILE_TEST.xlsx");

		System.out.println("Email initialzed ...");
		MultiPartEmail email = new MultiPartEmail();
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
		// add the attachment
		email.attach(attachment);
		System.out.println("Sending...!!");
		email.send();
		System.out.println("Email Sent Successfully!!");
		
	
		
	}

}
