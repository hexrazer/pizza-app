package com.spring.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Addition;

public class AdditionApp {

	public static void main(String[] args) {
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("com/spring/model/addition_config.xml");
		Addition add1 = appContext.getBean("add1",Addition.class);
		add1.doSum();
		
		
		//registering shutdownhook calls destroy method
		appContext.registerShutdownHook();
	}

}
