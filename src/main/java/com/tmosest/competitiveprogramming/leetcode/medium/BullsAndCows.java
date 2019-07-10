package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

class BullsAndCows {

  String getHint(String secret, String guess) {
    Set<Integer> set = new HashSet<>(); //holds unmatches indecies
    int[] str = new int[10];
    int bulls = 0;
    for (int i = 0; i <= secret.length() - 1; i++) {
      if (guess.charAt(i) == secret.charAt(i)) {
        bulls++;
      } else {
        //positions do not match!
        str[secret.charAt(i) - '0']++;
        set.add(i);
      }
    }
    int cows = 0;

    for (int i : set) {
      int val = guess.charAt(i) - '0';
      if (str[val] > 0) {
        cows++;
        str[val]--;
      }
    }
    return bulls + "A" + cows + "B";
  }
}
