package com.tmosest.competitiveprogramming.designpatterns.decorator.starbuzz;

/**
 * Espresso Coffee is a base beverage that can be decorated.
 */
public class Espresso extends Beverage {

  /**
   * Create an espresso coffee beverage.
   */
  public Espresso() {
    description = "espresso coffee";
  }

  @Override
  double cost() {
    switch (size) {
      case VENTI:
        return 1.7;
      case GRANDE:
        return 1.6;
      default:
        return 1.5;
    }
  }
}
