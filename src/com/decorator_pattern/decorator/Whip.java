package com.decorator_pattern.decorator;

import com.decorator_pattern.component.Beverage;

public class Whip extends CondimentDecorator {
	
	public Whip(Beverage beverage) {
		this.beverage=beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
	public double cost() {
		return beverage.cost()+.80;
	}

}
