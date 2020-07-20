package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class MaximumNumberOfNonoverlappingSubstrings {

  List<String> maxNumOfSubstrings(String ss) {
    char[] letters = ss.toCharArray();
    HashMap<Character, int[]> range = new HashMap<>();

    // get each character's range
    for (int i = 0; i < letters.length; i++) {
      char cur = letters[i];
      if (range.containsKey(cur)) {
        range.get(cur)[1] = i;
      } else {
        range.put(cur, new int[]{i, i});
      }
    }

    // extend the range
    List<int[]> values = new ArrayList<>(range.values());
    for (int[] r : values) {

      // gather all characters in the range r[0]...r[1]
      Set<Character> seen = new HashSet<>();
      int size = 0;
      int min = r[0];
      int max = r[1];
      for (int i = r[0]; i <= r[1]; i++) {
        if (seen.add(letters[i])) {
          int[] temp = range.get(letters[i]);
          min = Math.min(min, temp[0]);
          max = Math.max(max, temp[1]);
        }
      }

      // extend the range untile the range will not cover any other new character
      while (seen.size() != size) {
        size = seen.size();
        int localMin = min;
        int localMax = max;

        for (int i = min; i < r[0]; i++) {
          if (seen.add(letters[i])) {
            int[] temp = range.get(letters[i]);
            localMin = Math.min(localMin, temp[0]);
            localMax = Math.max(localMax, temp[1]);
          }
        }

        for (int i = r[1] + 1; i <= max; i++) {
          if (seen.add(letters[i])) {
            int[] temp = range.get(letters[i]);
            localMin = Math.min(localMin, temp[0]);
            localMax = Math.max(localMax, temp[1]);
          }
        }

        r[0] = min; // new end point
        r[1] = max;
        min = localMin; // new start point
        max = localMax;
        // System.out.println("====");
      }
    }

    Collections.sort(values, (one, two) -> one[1] - two[1]);

    int pointers = -1;
    List<String> res = new ArrayList<>();

    for (int[] r : values) {
      if (r[0] > pointers) { // can be accepted
        pointers = r[1]; // p means lastest used index
        res.add(ss.substring(r[0], r[1] + 1));
      }
    }
    return res;
  }
}
