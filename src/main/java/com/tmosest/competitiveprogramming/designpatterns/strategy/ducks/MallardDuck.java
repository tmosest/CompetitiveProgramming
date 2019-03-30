package com.tmosest.competitiveprogramming.designpatterns.strategy.ducks;

/**
 * Implementation of Duck that can fly and quack.
 */
public class MallardDuck extends Duck {

  /**
   * Create a new Mallard Duck.
   */
  public MallardDuck() {
    flyableBehavior = new FlyWithWings();
    quackableBehavior = new Quack();
  }

  @Override
  public String display() {
    return "I'm a mallard!";
  }
}
