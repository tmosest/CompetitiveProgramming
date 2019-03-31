package com.tmosest.competitiveprogramming.designpatterns.decorator.starbuzz;

/**
 * Abstract base class for star buzz coffee.
 */
public abstract class Beverage {
  String description = "unknown blend of coffee";

  /**
   * Get the description of the beverage.
   * @return The description.
   */
  public String getDescription() {
    return description;
  }

  /**
   * Get the cost of the beverage.
   * @return The cost.
   */
  abstract double cost();
}
