package com.decorator_pattern.decorator;

import com.decorator_pattern.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;
	public abstract String getDescription();
}
