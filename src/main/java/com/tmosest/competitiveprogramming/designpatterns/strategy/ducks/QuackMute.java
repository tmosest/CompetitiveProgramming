package com.tmosest.competitiveprogramming.designpatterns.strategy.ducks;

/**
 * Implementation of the QuackableBehavior interface that mutes the duck.
 * Originally each sub-class of Duck would override the method and implement their own version.
 * Using the strategy pattern we have refactored common functionality into their own classes.
 */
public class QuackMute implements QuackableBehavior {

  @Override
  public String quack() {
    return "";
  }
}
