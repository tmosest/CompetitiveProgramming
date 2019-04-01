package com.tmosest.competitiveprogramming.designpatterns.decorator.starbuzz;

/**
 * Dark Roast Coffee is a base beverage that can be decorated.
 */
public class DarkRoast extends Beverage {

  /**
   * Create a dark roast coffee beverage.
   */
  public DarkRoast() {
    description = "dark roast coffee";
  }

  @Override
  double cost() {
    switch (size) {
      case VENTI:
        return 2.20;
      case GRANDE:
        return 2.10;
      default:
        return 2.0;
    }
  }
}
