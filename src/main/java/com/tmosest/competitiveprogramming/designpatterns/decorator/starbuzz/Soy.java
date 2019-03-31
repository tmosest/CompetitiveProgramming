package com.tmosest.competitiveprogramming.designpatterns.decorator.starbuzz;

/**
 * Soy can decorate a beverage.
 */
public class Soy extends CondimentDecorator {
  private double cost = 1.75;
  // Underlying beverage to decorate.
  Beverage beverage;

  /**
   * Create a beverage with soy in it.
   * @param beverage The beverage we are decorating.
   */
  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + " with soy";
  }

  @Override
  double cost() {
    return cost + beverage.cost();
  }
}
