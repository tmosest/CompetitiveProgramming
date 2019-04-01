package com.tmosest.competitiveprogramming.designpatterns.decorator.starbuzz;

/**
 * Abstract base class for star buzz coffee.
 */
public abstract class Beverage {
  String description = "unknown blend of coffee";
  // enum of sizes
  enum Size {
    TALL,
    GRANDE,
    VENTI
  }
  // the current size
  Size size = Size.TALL;

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

  /**
   * New feature to get the size of the beverage.
   * @return The size.
   */
  public Size getSize() {
    return size;
  }

  /**
   * New method to set the size of the beverage.
   * @param size The new size.
   */
  public void setSize(Size size) {
    this.size = size;
  }
}
