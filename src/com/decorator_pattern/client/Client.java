package com.decorator_pattern.client;

import com.decorator_pattern.component.Beverage;
import com.decorator_pattern.concrete_component.DarkRoast;
import com.decorator_pattern.decorator.Mocha;
import com.decorator_pattern.decorator.Whip;

public class Client {
	public static void main(String[] args) {
		Beverage beverage = new DarkRoast();
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		System.out.println(beverage.getDescription()+" "+beverage.cost());
	}
}
