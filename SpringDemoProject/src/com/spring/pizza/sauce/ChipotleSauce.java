package com.spring.pizza.sauce;

import org.springframework.stereotype.Component;
@Component
public class ChipotleSauce implements Sauce {
	private Spice spice;

	public Spice getSpice() {
		return spice;
	}

	public void setSpice(Spice spice) {
		this.spice = spice;
	}

	@Override
	public void prepareSauce(Sauce sauce) {
		System.out.println("Prepared Chipotle "+this.spice +" spicy sauce");
		
	}

	@Override
	public String toString() {
		return "ChipotleSauce [spice=" + spice + "]";
	}

	public ChipotleSauce() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public ChipotleSauce(Spice spice) {
		super();
		this.spice = spice;
	}
	
	
	
	
	
}
