package javamail;

import java.io.File;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class AttechementMailDemo {

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

			// authentication of sender mail.
			Session session = Session.getDefaultInstance(prop, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(from, password);
				}
			});
			// session.setDebug(true); this is property for the enable debug mode.
			// compose message

			MimeMessage message = new MimeMessage(session);
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("find your rank from atteched file");

			//ADD TEXT 
			MimeBodyPart bodyPart = new MimeBodyPart();
			bodyPart.setText("congratulation you are cleared this exam..");
			
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(bodyPart);

			//ADD ATTECHMENT
			MimeBodyPart bodyPart2 =new MimeBodyPart();
			DataSource dataSource=new FileDataSource(new File("src/result.xlsx"));
			bodyPart2.setDataHandler(new DataHandler(dataSource));
			bodyPart2.setFileName("result.xlsx");
			
			
			multipart.addBodyPart(bodyPart);
			multipart.addBodyPart(bodyPart2);
			
			message.setContent(multipart);
			// send message
			Transport.send(message);
			System.out.println("message sent successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
