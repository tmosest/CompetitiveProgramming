package com.tmosest.competitiveprogramming.designpatterns.strategy.ducks;

/**
 * Implementation of Duck that cannot fly or quack.
 */
public class DecoyDuck extends Duck {

  /**
   * Create a new decoy duck that cannot quack or fly.
   */
  public DecoyDuck() {
    flyableBehavior = new FlyNoWay();
    quackableBehavior = new QuackMute();
  }

  @Override
  public String display() {
    return "I'm a decoy duck!";
  }
}
