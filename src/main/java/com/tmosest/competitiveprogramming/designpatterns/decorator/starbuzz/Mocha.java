package com.tmosest.competitiveprogramming.designpatterns.decorator.starbuzz;

/**
 * Mocha can decorate a beverage.
 */
public class Mocha extends CondimentDecorator {
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
    double cost;
    switch (size) {
      case VENTI:
        cost = 1.70;
        break;
      case GRANDE:
        cost = 1.60;
        break;
      default:
        cost = 1.50;
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
