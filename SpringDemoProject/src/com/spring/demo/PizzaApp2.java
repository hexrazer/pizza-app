package com.spring.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.pizza.Pizza;
import com.spring.pizza.VegMexicanaPizza;

public class PizzaApp2 {
	public static void main(String[] args) {
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("com/spring/pizza/pizza_config.xml");
		Pizza pizza1 = appContext.getBean("vegmexpizza",VegMexicanaPizza.class);
		System.out.println(pizza1);
	}
}
