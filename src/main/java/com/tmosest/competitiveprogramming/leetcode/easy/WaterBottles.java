package com.tmosest.competitiveprogramming.leetcode.easy;

class WaterBottles {

  int numWaterBottles(int numBottles, int numExchange) {
    int res = 0;
    int bottlesToDrink = numBottles;
    int empty = 0;

    while (bottlesToDrink > 0) {
      res += bottlesToDrink;
      empty = bottlesToDrink + empty;
      bottlesToDrink = empty / numExchange;
      empty -= bottlesToDrink * numExchange;
    }

    return res;
  }
}
