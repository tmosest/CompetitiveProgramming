package com.tmosest.competitiveprogramming.designpatterns.strategy.ducks;

/**
 * Implementation of duck that cannot fly and squeaks instead.
 */
public class RubberDuck extends Duck {

  /**
   * Create a new rubber duck.
   */
  public RubberDuck() {
    flyableBehavior = new FlyNoWay();
    quackableBehavior = new Squeak();
  }

  @Override
  public String display() {
    return "I'm a rubber duck";
  }
}
