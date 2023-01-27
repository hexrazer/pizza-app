package com.spring.model;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Phone {
	private String model;
	private double price;
	private String brand;
	@Autowired
	@Qualifier("mf")
	private Processor processor;
	private List<ScreenSize> screenSize;
	private Map<Integer,Color> colors;
	
	public Phone() {
		super();
		System.out.println("No arg constructor called");
	}
	public Phone(String model, double price, String brand,Processor processor,List<ScreenSize> screenSize,Map<Integer,Color> colors) {
		super();
		this.model = model;
		this.price = price;
		this.brand = brand;
		this.processor=processor;
		this.screenSize = screenSize;
		this.colors=colors;
		System.out.println("all arg constructor called");
	}
	
	public Phone(Processor processor) {
		System.out.println("used constructor injection "+processor.getModel());
		this.processor=processor;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void initiatePhone() {
		System.out.println("Phone is initiliazing");
	}
	
	public void destroyPhone() {
		System.out.println("Phone is destructed");
	}
	
	public List<ScreenSize> getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(List<ScreenSize> screenSize) {
		this.screenSize = screenSize;
	}
	public Processor getProcessor() {
		return processor;
	}
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
	
	
	public Map<Integer, Color> getColors() {
		return colors;
	}
	public void setColors(Map<Integer, Color> colors) {
		this.colors = colors;
	}
	@Override
	public String toString() {
		return "Phone [model=" + model + ", price=" + price + ", brand=" + brand + ", processor=" + processor
				+ ", screenSize=" + screenSize + ", colors=" + colors + "]";
	}
	
	@PostConstruct
	private void start() {
		System.out.println("Phone Started....");

	}
	
	@PreDestroy 
	private void switchOff() {
		System.out.println("Phone has been turned off.....");
	}
	
	
	
	
	
	
	
	
	
	
	
}
