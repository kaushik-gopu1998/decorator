package com.decorator_pattern.concrete_component;

import com.decorator_pattern.component.Beverage;

public class Espresso extends Beverage {
	public Espresso() {
		description = "Espresso";
	}
	@Override
	public double cost() {
		return 3.29;
	}
}
