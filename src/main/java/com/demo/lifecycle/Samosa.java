package com.demo.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Samosa {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=s" + price + "]";
	}
	@PostConstruct
	public void init() {
		System.out.println("this is init()method");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("this is destroy()method");
	}

	public Samosa(double price) {
		super();
		this.price = price;
	}
	
}
