package com.spring.model;

public class ScreenSize {
	private double height;
	private double width;
	private String glass;
	public ScreenSize() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ScreenSize(double height, double width, String glass) {
		super();
		this.height = height;
		this.width = width;
		this.glass = glass;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public String getGlass() {
		return glass;
	}
	public void setGlass(String glass) {
		this.glass = glass;
	}
	@Override
	public String toString() {
		return "ScreenSize [height=" + height + ", width=" + width + ", glass=" + glass + "]";
	}
	
	
}
