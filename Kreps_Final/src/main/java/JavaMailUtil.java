/***
Casey Kreps

Mail Handler Class

Kreps Final Assignment

August 25, 2022
 ***/

import java.util.Date;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



public class JavaMailUtil{
	
	public static void send(String toEmail) throws MessagingException {
		
		String myemail = "servlettest12";
		String password = "pcqcubsfzolmyygr";
		
		DateBean dBean = new DateBean(); /** import bean **/
		Date dateTime = dBean.getDateTime();
		
			Properties properties = new Properties();
			System.out.println("Sending....");	
		
			properties.put("mail.smtp.auth", true);
			properties.put("mail.smtp.host", "smtp.gmail.com");
			properties.put("mail.smtp.port", 587);
			properties.put("mail.smtp.starttls.enable", true);
			properties.put("mail.transport.protocol", "smtp");
			properties.put("mail.smtp.ssl.trust", "*");
			
			
			Session session = Session.getInstance(properties, new javax.mail.Authenticator(){
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(myemail, password);
					
				}
					});
			
			Message message = new MimeMessage(session);
			message.setSubject("Verified");
			message.setContent("<h1>Email is sent on </h1>" + dateTime, "text/html");
			
			Address addressTo = new InternetAddress(toEmail);
			message.setRecipient(Message.RecipientType.TO, addressTo);

			Transport.send(message);
			System.out.println("Sent");
			
	}			
}		
			
			
			
			
			
			
			
			
			
