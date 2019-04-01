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
    double cost;
    switch (size) {
      case VENTI:
        cost = 1.45;
        break;
      case GRANDE:
        cost = 1.35;
        break;
      default:
        cost = 1.25;
    }
    return cost + beverage.cost();
  }

  @Override
  public Size getSize() {
    return beverage.getSize();
  }

  @Override
  public void setSize(Size size) {
    beverage.setSize(size);
  }
}
