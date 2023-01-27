package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.pizza.Pizza;
import com.spring.pizza.VegMexicanaPizza;
import com.spring.pizza.base.Base;
import com.spring.pizza.base.Size;
import com.spring.pizza.base.ThinCrust;

public class StereoApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/demo/stereo_config.xml");
		Pizza piz = context.getBean("mypizza",VegMexicanaPizza.class);
		System.out.println(piz);
		

	}

}
