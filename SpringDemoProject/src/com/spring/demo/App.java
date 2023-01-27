package com.spring.demo;

import java.util.Map;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Addition;
import com.spring.model.Color;
import com.spring.model.Phone;

public class App {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Phone iphone4s = context.getBean("iPhone4s", Phone.class);
		Map<Integer,Color> colors = iphone4s.getColors();
		
		Set<Integer> set = colors.keySet();
		for(Map.Entry<Integer, Color> colorEntry : colors.entrySet()) {
			Integer k = colorEntry.getKey();
			Color color = colorEntry.getValue();
			System.out.println(k+" "+color.getColorId()+" "+color.getBaseColor()+" "+color.getHue());
		}
		System.out.println(iphone4s);
		Addition add1 = context.getBean("add1",Addition.class);
		add1.doSum();
		
		context.registerShutdownHook();
		
		
		
		
		
		
	}
}
