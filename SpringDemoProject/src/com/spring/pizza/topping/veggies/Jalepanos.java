package com.spring.pizza.topping.veggies;


import com.spring.pizza.base.Size;

public class Jalepanos implements Veggie {
	private Size size = Size.MEDIUM;
	private String taste = "Sweet and Sour";
	
	
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
		return "Jalepanos [size=" + size + ", taste=" + taste + "]";
	}
	
	
}
