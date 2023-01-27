package com.spring.pizza;

import com.spring.pizza.base.Base;
import com.spring.pizza.sauce.Sauce;
import com.spring.pizza.topping.Topping;

public interface Pizza {
	public void setName(String pizzaName);
	public void setPrice(Double price);
	public void setBase(Base base);
	public void setSauce(Sauce sauce);
	public void setTopping(Topping topping);
}
