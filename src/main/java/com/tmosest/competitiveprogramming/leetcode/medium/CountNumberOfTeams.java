package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

class CountNumberOfTeams {

  private int sizeLimit = 3;
  private int[] rating;
  private List<List<Integer>> lists;


  int numTeams(int[] rating) {
    this.rating = rating;
    lists = new ArrayList<>();

    for (int i = 0; i < rating.length; i++) {
      generate(i, new ArrayList<>());
    }

    return (int) lists.stream().filter(this::validRanking).count();
  }

  private void generate(int index, List<Integer> list) {
    if (index >= rating.length) {
      return;
    }

    list.add(rating[index]);

    if (list.size() == sizeLimit) {
      lists.add(list);
      return;
    }

    for (int i = index + 1; i < rating.length; i++) {
      generate(i, new ArrayList<>(list));
    }
  }

  private boolean validRanking(List<Integer> list) {
    return (list.get(0) < list.get(1) && list.get(1) < list.get(2))
        || (list.get(0) > list.get(1) && list.get(1) > list.get(2));
  }
}
