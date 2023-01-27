package com.spring.pizza.topping;

import java.util.List;

import com.spring.pizza.topping.veggies.Veggie;

public interface Topping {
	public void prepareTopping(Topping topping);
	public void setVeggies(List<Veggie> veggieList);
}
