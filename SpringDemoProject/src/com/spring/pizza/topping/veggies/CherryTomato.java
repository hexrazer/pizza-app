package com.spring.pizza.topping.veggies;

import com.spring.pizza.base.Size;


public class CherryTomato implements Veggie {
	private Size size = Size.SMALL;
	private String taste = "Sweet and Sour";
	public Size getSize() {
		return size;
	}
	public String getTaste() {
		return taste;
	}
	@Override
	public void setSize(Size size) {
		this.size=size;
		
	}
	@Override
	public void setTaste(String taste) {
		this.taste=taste;
		
	}
	@Override
	public String toString() {
		return "CherryTomato [size=" + size + ", taste=" + taste + "]";
	}
	
	
}
