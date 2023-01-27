package com.spring.pizza.topping.veggies;


import com.spring.pizza.base.Size;


public class Capsicum implements Veggie {
	private Size size = Size.LARGE;
	private String taste = "Slightly Bitter";
	
	
	public Size getSize() {
		return size;
	}
	public String getTaste() {
		return taste;
	}
	@Override
	public void setSize(Size size) {
		// TODO Auto-generated method stub
		this.size=size;
		
	}
	@Override
	public void setTaste(String taste) {
		// TODO Auto-generated method stub
		this.taste=taste;
		
	}
	@Override
	public String toString() {
		return "Capsicum [size=" + size + ", taste=" + taste + "]";
	}
	
}
