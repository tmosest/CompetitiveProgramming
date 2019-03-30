package com.tmosest.competitiveprogramming.designpatterns.strategy.ducks;

/**
 * Implementation of the FlyableBehavior interface that prevents ducks from flying.
 */
public class FlyNoWay implements FlyableBehavior {

  @Override
  public String fly() {
    return "I can't fly...";
  }
}
