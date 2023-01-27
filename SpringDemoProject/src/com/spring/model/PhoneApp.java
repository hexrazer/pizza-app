package com.spring.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PhoneApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/model/phone_config.xml");
		Phone phone1 = context.getBean("vivo_phone",Phone.class);
		System.out.println(phone1);

	}

}
