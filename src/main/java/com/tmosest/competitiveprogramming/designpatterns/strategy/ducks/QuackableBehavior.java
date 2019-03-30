package com.tmosest.competitiveprogramming.designpatterns.strategy.ducks;

/**
 * A common interface for all classes that want to fly.
 * This allows quacking to be something that non-ducks can do as well.
 */
public interface QuackableBehavior {
  String quack();
}
