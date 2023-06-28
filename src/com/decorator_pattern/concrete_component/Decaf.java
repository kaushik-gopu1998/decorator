package com.decorator_pattern.concrete_component;

import com.decorator_pattern.component.Beverage;

public class Decaf extends Beverage {
	
	public Decaf() {
		this.description = "Decaf";
	}

	@Override
	public double cost() {
		return 1.29;
	}

}
