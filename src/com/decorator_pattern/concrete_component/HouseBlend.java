package com.decorator_pattern.concrete_component;

import com.decorator_pattern.component.Beverage;

public class HouseBlend extends Beverage {
   public HouseBlend() {
	  this.description = "HouseBlend";		
   }
	@Override
	public double cost() {
		return 5.89;
	}

}
