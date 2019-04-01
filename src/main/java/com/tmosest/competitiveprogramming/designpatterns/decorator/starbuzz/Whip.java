package com.tmosest.competitiveprogramming.designpatterns.decorator.starbuzz;

/**
 * Whip can decorate a beverage.
 */
public class Whip extends CondimentDecorator {
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
    double cost;
    switch (size) {
      case VENTI:
        cost = .5;
        break;
      case GRANDE:
        cost = .4;
        break;
      default:
        cost = .3;
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
