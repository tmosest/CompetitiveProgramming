package com.tmosest.competitiveprogramming.designpatterns.strategy.ducks;

/**
 * Implementation of the QuackableBehavior interface that allows ducks to squeak.
 * Originally each sub-class of Duck would override the method and implement their own version.
 * Using the strategy pattern we have refactored common functionality into their own classes.
 */
public class Squeak implements QuackableBehavior {

  @Override
  public String quack() {
    return "Squeak Squeak Squeak!";
  }
}
