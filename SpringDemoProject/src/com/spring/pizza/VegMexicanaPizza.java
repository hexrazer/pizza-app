package com.spring.pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.spring.pizza.base.Base;
import com.spring.pizza.sauce.Sauce;
import com.spring.pizza.topping.Topping;

@Component("mypizza")
public class VegMexicanaPizza implements Pizza {
	@Value("Veg Mexicana Pizza")
	private String name;
	@Value("44.88")
	private Double price;
	@Autowired
	private Base base;

	private Topping topping;

	private Sauce sauce;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * @return the base
	 */
	
	public Base getBase() {
		return base;
	}
	/**
	 * @param base the base to set
	 */
	
	public void setBase(Base base) {
		System.out.println("setting base from setter injection");
		this.base = base;
	}
	/**
	 * @return the topping
	 */
	public Topping getTopping() {
		return topping;
	}
	/**
	 * @param topping the topping to set
	 */
	public void setTopping(Topping topping) {
		this.topping = topping;
	}
	/**
	 * @return the sauce
	 */
	public Sauce getSauce() {
		return sauce;
	}
	/**
	 * @param sauce the sauce to set
	 */
	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}
	@Override
	public String toString() {
		return "VegMexicanaPizza [name=" + name + ", price=" + price + ", base=" + base + ", topping=" + topping
				+ ", sauce=" + sauce + "]";
	}
	public VegMexicanaPizza() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VegMexicanaPizza(String name, Double price, Base base, Topping topping, Sauce sauce) {
		super();
		this.name = name;
		this.price = price;
		this.base = base;
		this.topping = topping;
		this.sauce = sauce;
	}
	
	
}
