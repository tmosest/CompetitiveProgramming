package com.tmosest.competitiveprogramming.leetcode;

public class FruitIntoBaskets {

  /**
   * Determine most fruit when only two types are allowed.
   * @param tree The tree of fruit.
   * @return The max number.
   */
  public int totalFruit(int[] tree) {
    int result = 0;
    for (int i = 0; i < tree.length; i++) {
      result = Math.max(totalFruit(tree, i), result);
    }
    return result;
  }

  private int totalFruit(int[] tree, int start) {
    int fruitOne = -1;
    int fruitTwo = -1;
    int result = 0;
    for (int i = start; i < tree.length; i++) {
      int fruit = tree[i];
      if (fruitOne == -1 || fruit == fruitOne) {
        fruitOne = fruit;
      } else if (fruitTwo == -1 || fruit == fruitTwo) {
        fruitTwo = fruit;
      } else {
        if (!(fruit == fruitOne || fruit == fruitTwo)) {
          return result;
        }
      }
      ++result;
    }
    return result;
  }
}
