package com.tmosest.competitiveprogramming.designpatterns.decorator.starbuzz;

/**
 * House Blend Coffee is a base beverage that can be decorated.
 */
public class Houseblend extends Beverage {

  /**
   * Create a house blend coffee beverage.
   */
  public Houseblend() {
    description = "house blend coffee";
  }

  @Override
  double cost() {
    return 2.0;
  }
}
