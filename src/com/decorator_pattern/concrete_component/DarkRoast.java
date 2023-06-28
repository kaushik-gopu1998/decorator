package com.decorator_pattern.concrete_component;

import com.decorator_pattern.component.Beverage;

public class DarkRoast extends Beverage{
	public DarkRoast(){
		description = "DarkRoast";
	}
	@Override
	public double cost() {
		return 2.99;
	}
}
