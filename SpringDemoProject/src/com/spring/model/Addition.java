package com.spring.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Addition  {
	private int x;
	private int y;
	
	
	
	public Addition(double x, double y) {
		this.x = (int)x;
		this.y = (int)y;
		System.out.println("double double");
	}
	
	public Addition(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("int int");
	}
	
	public Addition(String x, String y) {
		this.x = Integer.parseInt(x);
		this.y = Integer.valueOf(y);
		System.out.println("String String");
	}
	
	
	@Override
	public String toString() {
		return this.x+" "+this.y;
	}
	
	public void doSum() {
		System.out.println("x:"+this.x);
		System.out.println("y:"+this.y);
		System.out.println("Addition : "+(x+y));
	}
	
	@PostConstruct
	private void start() {
		System.out.println("Started....");

	}
	
	@PreDestroy
	private void end() {
		// TODO Auto-generated method stub
		System.out.println("ended...");
	}

	
	
}
