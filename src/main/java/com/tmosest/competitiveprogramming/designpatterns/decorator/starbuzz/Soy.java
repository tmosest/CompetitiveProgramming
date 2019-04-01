package com.tmosest.competitiveprogramming.designpatterns.decorator.starbuzz;

/**
 * Soy can decorate a beverage.
 */
public class Soy extends CondimentDecorator {
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
    double cost;
    switch (size) {
      case VENTI:
        cost = 1.95;
        break;
      case GRANDE:
        cost = 1.85;
        break;
      default:
        cost = 1.75;
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
