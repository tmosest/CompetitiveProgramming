package com.tmosest.competitiveprogramming.designpatterns.strategy.ducks;

/**
 * A common interface for all classes that want to fly.
 * This allows flying to be something that non-ducks can do as well.
 */
public interface FlyableBehavior {
  String fly();
}
