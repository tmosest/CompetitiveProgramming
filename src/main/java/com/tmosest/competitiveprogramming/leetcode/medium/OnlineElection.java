package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class OnlineElection {

  private List<List<Vote>> list;

  OnlineElection(int[] persons, int[] times) {
    list = new ArrayList<>();
    Map<Integer, Integer> count = new HashMap<>();
    for (int i = 0; i < persons.length; ++i) {
      int person = persons[i];
      int time = times[i];
      int num = count.getOrDefault(person, 0) + 1;

      count.put(person, num);
      while (list.size() <= num) {
        list.add(new ArrayList<>());
      }
      list.get(num).add(new Vote(person, time));
    }
  }

  public int search(int time) {
    // Binary search on list[i][0].time for smallest i
    // such that list[i][0].time > t
    int lo = 1;
    int hi = list.size();
    while (lo < hi) {
      int mi = lo + (hi - lo) / 2;
      if (list.get(mi).get(0).time <= time) {
        lo = mi + 1;
      } else {
        hi = mi;
      }
    }
    int index = lo - 1;

    // Binary search on list[i][j].time for smallest j
    // such that list[i][j].time > t
    lo = 0;
    hi = list.get(index).size();
    while (lo < hi) {
      int mi = lo + (hi - lo) / 2;
      if (list.get(index).get(mi).time <= time) {
        lo = mi + 1;
      } else {
        hi = mi;
      }
    }
    int temp = Math.max(lo - 1, 0);
    return list.get(index).get(temp).person;
  }


  private class Vote {

    private int person;
    private int time;

    private Vote(int person, int time) {
      this.person = person;
      this.time = time;
    }
  }
}
