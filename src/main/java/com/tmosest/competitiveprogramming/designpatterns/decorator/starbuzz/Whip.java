package com.tmosest.competitiveprogramming.designpatterns.decorator.starbuzz;

/**
 * Whip can decorate a beverage.
 */
public class Whip extends CondimentDecorator {
  private double cost = 0.3;
  // Underlying beverage to decorate.
  Beverage beverage;

  /**
   * Create a beverage with whip in it.
   * @param beverage The beverage we are decorating.
   */
  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + " with whip";
  }

  @Override
  double cost() {
    return cost + beverage.cost();
  }
}
