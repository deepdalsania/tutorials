package javamail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class PlanTextMailDemo {
	public static void main(String[] args) {
		try {
			String from = "senderMail@gmail.com";
			String password = "*******";
			String to = "reciverMail@gmail.com";

			Properties prop = new Properties();
			prop.put("mail.smtp.host", "smtp.gmail.com");
			prop.put("mail.smtp.auth", "true");
			prop.put("mail.smtp.starttls.enable", "true");
			prop.put("mail.smtp.port", "587");

			//authentication of sender mail.
			Session session = Session.getDefaultInstance(prop, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(from, password);
				}
			});
			// session.setDebug(true); this is property for the enable debug mode.
			// compose message

			MimeMessage message = new MimeMessage(session);
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("regarding practice for java");
			message.setText("welcome to the git-hub.");
			// send message
			Transport.send(message);
			System.out.println("message sent successfully");
		
		
		} catch (MessagingException e) {
			e.printStackTrace();
		}

	}
}
