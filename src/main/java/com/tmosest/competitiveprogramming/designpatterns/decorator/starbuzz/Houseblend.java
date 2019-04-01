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
    switch (size) {
      case VENTI:
        return 1.8;
      case GRANDE:
        return 1.7;
      default:
        return 1.6;
    }
  }
}
