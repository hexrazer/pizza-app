package com.spring.pizza.base;

public class ThinCrust implements Base{
	private Size size;
	private Thickness thickness;
	private String sizeDescription;
	
	public String getSizeDescription() {
		return sizeDescription;
	}
	public void setSizeDescription() {
		System.out.println("Called....");
		this.sizeDescription = this.size.equals(Size.SMALL) ? this.sizeDescription="Small 7inches" :
			(this.size.equals(Size.MEDIUM) ? this.sizeDescription="Medium 10inches":(this.size.equals(Size.LARGE)?this.sizeDescription="Large 12inches": "Extra Large 20inches"));
	}
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
		this.sizeDescription = this.size.equals(Size.SMALL) ? this.sizeDescription="Small 7inches" :
			(this.size.equals(Size.MEDIUM) ? this.sizeDescription="Medium 10inches":(this.size.equals(Size.LARGE)?this.sizeDescription="Large 12inches": "Extra Large 20inches"));
	}
	public Thickness getThickness() {
		return thickness;
	}
	public void setThickness(Thickness thickness) {
		this.thickness = thickness;
	}
	@Override
	public void prepareBase(Base base) {
		
		System.out.println("Prepared "+this.sizeDescription+" "+this.thickness+" "+"Crust Base");
	}
	@Override
	public String toString() {
		return "ThinCrust [size=" + size + ", thickness=" + thickness + ", sizeDescription=" + sizeDescription + "]";
	}
	
	
	
	
	
	
}
