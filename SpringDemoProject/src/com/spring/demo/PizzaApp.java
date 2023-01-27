package com.spring.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.pizza.Pizza;
import com.spring.pizza.VegMexicanaPizza;
import com.spring.pizza.base.Base;
import com.spring.pizza.base.Size;
import com.spring.pizza.base.Thickness;
import com.spring.pizza.base.ThinCrust;
import com.spring.pizza.sauce.ChipotleSauce;
import com.spring.pizza.sauce.Sauce;
import com.spring.pizza.sauce.Spice;
import com.spring.pizza.topping.Topping;
import com.spring.pizza.topping.VegMexicanaTopping;
import com.spring.pizza.topping.veggies.Capsicum;
import com.spring.pizza.topping.veggies.CherryTomato;
import com.spring.pizza.topping.veggies.Jalepanos;
import com.spring.pizza.topping.veggies.Veggie;

public class PizzaApp {

	public static void main(String[] args) {
		/*
		  Base mediumThinBase = new ThinCrust(); mediumThinBase.setSize(Size.MEDIUM);
		  mediumThinBase.setThickness(Thickness.THIN);
		  mediumThinBase.setSizeDescription();
		  mediumThinBase.prepareBase(mediumThinBase);
		  System.out.println(mediumThinBase);
		  
		  Sauce chipotleHighSpicySauce = new ChipotleSauce();
		  chipotleHighSpicySauce.setSpice(Spice.HIGH);
		  chipotleHighSpicySauce.prepareSauce(chipotleHighSpicySauce);
		  System.out.println(chipotleHighSpicySauce);
		  
		  ArrayList<Veggie> veggieList = new ArrayList<Veggie>(); veggieList.add(new
		  CherryTomato()); veggieList.add(new Jalepanos()); veggieList.add(new
		  Capsicum());
		  
		  
		  Topping mexicanaVegToppings = new VegMexicanaTopping();
		  mexicanaVegToppings.setVeggies(veggieList);
		  mexicanaVegToppings.prepareTopping(mexicanaVegToppings);
		  System.out.println(mexicanaVegToppings);
		  
		  Pizza pizza1 = new VegMexicanaPizza();
		  pizza1.setName("Veg Mexicana Pizza Medium"); pizza1.setPrice(450.99);
		  pizza1.setBase(mediumThinBase); pizza1.setSauce(chipotleHighSpicySauce);
		  pizza1.setTopping(mexicanaVegToppings); System.out.println(pizza1);*/
		
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("com/spring/pizza/pizza_config.xml");
		VegMexicanaTopping topping1 = appContext.getBean("mexicana_topping",VegMexicanaTopping.class);
		List<Veggie> list = topping1.getVeggies();
		for(Veggie veggie : list) {
			if(veggie instanceof CherryTomato) {
				CherryTomato cherryTomato =(CherryTomato) veggie;
				System.out.println(cherryTomato.getTaste());
			}
			if(veggie instanceof Jalepanos) {
				Jalepanos jalepanos=(Jalepanos) veggie;
				System.out.println(jalepanos.getTaste());
			}
			if(veggie instanceof Capsicum) {
				Capsicum capsicum =(Capsicum) veggie;
				System.out.println(capsicum.getTaste());
			}
				
		}
 
		
		Base base1 = appContext.getBean("thin_medium_base",ThinCrust.class);
		
		System.out.println(base1);

	}

}
