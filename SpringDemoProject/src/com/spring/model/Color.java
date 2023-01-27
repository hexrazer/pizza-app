package com.spring.model;

public class Color {
	private int colorId;
	private String baseColor;
	private String hue;
	
	public Color() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Color(int colorId, String baseColor, String hue) {
		super();
		this.colorId = colorId;
		this.baseColor = baseColor;
		this.hue = hue;
	}

	public int getColorId() {
		return colorId;
	}

	public void setColorId(int colorId) {
		this.colorId = colorId;
	}

	public String getBaseColor() {
		return baseColor;
	}

	public void setBaseColor(String baseColor) {
		this.baseColor = baseColor;
	}

	public String getHue() {
		return hue;
	}

	public void setHue(String hue) {
		this.hue = hue;
	}

	@Override
	public String toString() {
		return "Colors [colorId=" + colorId + ", baseColor=" + baseColor + ", hue=" + hue + "]";
	}
	
	
	
	
}
