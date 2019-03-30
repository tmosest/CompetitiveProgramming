package com.tmosest.competitiveprogramming.designpatterns.strategy.ducks;

/**
 * Super class for all ducks in a duck simulation game.
 */
public class Duck {
  // Delegate for flying.
  FlyableBehavior flyableBehavior;
  // Delegate for quacking.
  QuackableBehavior quackableBehavior;

  /**
   * Each subclass overrides this method as needed which is how quack was originally handled.
   */
  public String display() {
    return "I'm a duck, I'm a duck, yes I'm a duck!";
  }

  /**
   * Adding this method was the original goal of this exercise.
   * When we followed the original pattern of quack it caused rubber ducks to fly...
   * Using the strategy pattern makes this much easier and better.
   */
  public String fly() {
    return flyableBehavior.fly();
  }

  /**
   * Originally each sub-class implemented their own quack as needed.
   * Delegating this to a new class makes it easier and more reusable.
   */
  public String quack() {
    return quackableBehavior.quack();
  }
}
