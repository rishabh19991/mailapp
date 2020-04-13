package com.pysam.mailing;
 
import javax.mail.MessagingException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pysam.mailing.service.MailApiService;
import com.pysam.mailing.service.MailSendingService;
 
public class Mail {
 
	@SuppressWarnings("resource")
	public static void main(String[] args) throws MessagingException {
 
		// loading the definitions from the given XML file
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
 
		MailApiService service = (MailApiService) context
				.getBean("mailApiService");
		String message = service.sayHello();
		System.out.println(message);
 
		//set a new name
		service.setName("Spring");
		message = service.sayHello();
		System.out.println(message);
		MailSendingService.sendAsHtml("abbysingh01@gmail.com", "Pysam Infotech Mail Testing", "This is for testing mail code.");
	}
}