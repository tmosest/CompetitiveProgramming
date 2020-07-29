package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

class ProductOfNumbers {

  private List<Integer> list;

  ProductOfNumbers() {
    list = new ArrayList<>();
    list.add(1);
  }

  void add(int num) {
    if (num > 0) {
      list.add(list.get(list.size() - 1) * num);
    } else {
      list = new ArrayList<>();
      list.add(1);
    }
  }

  int getProduct(int lastNums) {
    int size = list.size();
    return lastNums < size ? list.get(size - 1) / list.get(size - lastNums - 1) : 0;
  }
}
