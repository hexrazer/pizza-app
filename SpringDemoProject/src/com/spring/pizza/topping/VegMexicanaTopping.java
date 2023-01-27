package com.spring.pizza.topping;

import java.util.List;

import org.springframework.stereotype.Component;

import com.spring.pizza.topping.veggies.Veggie;


public class VegMexicanaTopping implements Topping {

	private List<Veggie> veggies;
	
	
	public List<Veggie> getVeggies() {
		return veggies;
	}


	public void setVeggies(List<Veggie> veggies) {
		this.veggies = veggies;
	}


	@Override
	public void prepareTopping(Topping topping) {
		String veggieTopping="";
		for(Veggie veggie : this.veggies) {
			veggieTopping += veggie.getClass().getSimpleName()+" ";
		}
		System.out.println("Prepared Mexicana toppings with : "+veggieTopping);

	}


	@Override
	public String toString() {
		return "VegMexicanaTopping [veggiesList=" + veggies + "]";
	}
	
	

}
