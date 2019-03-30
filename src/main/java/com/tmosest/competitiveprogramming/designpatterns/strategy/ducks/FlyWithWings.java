package com.tmosest.competitiveprogramming.designpatterns.strategy.ducks;

/**
 * Implementation of the FlyableBehavior interface that allows ducks to fly with their wings.
 */
public class FlyWithWings implements FlyableBehavior {

  @Override
  public String fly() {
    return "I'm flying with my wings!";
  }
}
