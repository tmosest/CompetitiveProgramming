package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class MaximumNumberOfNonoverlappingSubstrings {

  List<String> maxNumOfSubstrings(String ss) {
    char[] s = ss.toCharArray();
    HashMap<Character, int[]> range = new HashMap<>();

    // get each character's range
    for (int i = 0; i < s.length; i++) {
      char cur = s[i];
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
      int size = 0, min = r[0], max = r[1];
      for (int i = r[0]; i <= r[1]; i++) {
        if (seen.add(s[i])) {
          int temp[] = range.get(s[i]);
          min = Math.min(min, temp[0]);
          max = Math.max(max, temp[1]);
        }
      }

      // extend the range untile the range will not cover any other new character
      while (seen.size() != size) {
        size = seen.size();
        int nMin = min;
        int nMax = max;

        for (int i = min; i < r[0]; i++) {
          if (seen.add(s[i])) {
            int temp[] = range.get(s[i]);
            nMin = Math.min(nMin, temp[0]);
            nMax = Math.max(nMax, temp[1]);
          }
        }

        for (int i = r[1] + 1; i <= max; i++) {
          if (seen.add(s[i])) {
            int temp[] = range.get(s[i]);
            nMin = Math.min(nMin, temp[0]);
            nMax = Math.max(nMax, temp[1]);
          }
        }

        r[0] = min; // new end point
        r[1] = max;
        min = nMin; // new start point
        max = nMax;
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
