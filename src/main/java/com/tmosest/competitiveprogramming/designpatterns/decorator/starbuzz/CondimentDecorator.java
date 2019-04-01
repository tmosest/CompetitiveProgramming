package com.tmosest.competitiveprogramming.designpatterns.decorator.starbuzz;

/**
 * Example of a decorator that allows us to create crazy dynamic beverages.
 */
abstract class CondimentDecorator extends Beverage {
  public abstract String getDescription();

  public abstract Size getSize();

  public abstract void setSize(Size size);
}
