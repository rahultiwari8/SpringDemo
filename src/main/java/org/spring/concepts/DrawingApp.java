package org.spring.concepts;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	
	public static void main(String[] args) {
		//Triangle tanle= new Triangle();
		@SuppressWarnings("deprecation")
	//	BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle tanle=(Triangle) context.getBean("tangle");
		
		tanle.draw();
		
		
		
		System.out.println("Git Krakken");
	}

}
