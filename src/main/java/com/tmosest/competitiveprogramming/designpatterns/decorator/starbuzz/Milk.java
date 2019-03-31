package com.tmosest.competitiveprogramming.designpatterns.decorator.starbuzz;

/**
 * Milk can decorate a beverage.
 */
public class Milk extends CondimentDecorator {
  private double cost = 1.25;
  // Underlying beverage to decorate.
  Beverage beverage;

  /**
   * Create a beverage with milk in it.
   * @param beverage The beverage we are decorating.
   */
  public Milk(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + " with milk";
  }

  @Override
  double cost() {
    return cost + beverage.cost();
  }
}
