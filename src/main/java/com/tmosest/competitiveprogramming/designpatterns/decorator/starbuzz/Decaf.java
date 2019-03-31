package com.tmosest.competitiveprogramming.designpatterns.decorator.starbuzz;

/**
 * Decaf Coffee is a base beverage that can be decorated.
 */
public class Decaf extends Beverage {

  /**
   * Create a decaf coffee beverage.
   */
  public Decaf() {
    description = "decaf coffee";
  }

  @Override
  double cost() {
    return 2.0;
  }
}
