package com.decorator_pattern.decorator;

import com.decorator_pattern.component.Beverage;

public class Mocha extends CondimentDecorator{
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		return beverage.getDescription()+ ", Mocha";
	}
	public double cost() {
		return beverage.cost()+.20;
	}
}
