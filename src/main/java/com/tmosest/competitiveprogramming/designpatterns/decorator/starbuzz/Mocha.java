package com.tmosest.competitiveprogramming.designpatterns.decorator.starbuzz;

/**
 * Mocha can decorate a beverage.
 */
public class Mocha extends CondimentDecorator {
  private double cost = 1.50;
  // Underlying beverage to decorate.
  Beverage beverage;

  /**
   * Create a beverage with mocha in it.
   * @param beverage The beverage we are decorating.
   */
  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + " with mocha";
  }

  @Override
  double cost() {
    return cost + beverage.cost();
  }
}
