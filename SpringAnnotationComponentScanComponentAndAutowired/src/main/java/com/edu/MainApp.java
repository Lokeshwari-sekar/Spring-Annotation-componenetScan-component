package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext cntxob=new AnnotationConfigApplicationContext(AppConfiguration.class);
		Samsung sob=cntxob.getBean(Samsung.class);
		sob.samsungDisplay();

	}

}
