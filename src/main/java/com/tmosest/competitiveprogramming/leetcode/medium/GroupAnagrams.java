package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class GroupAnagrams {
  /* Write code here. */

  /**
   * Group anagrams of strings together.
   *
   * @param strs The string array.
   * @return A List of anagram lists.
   */
  public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> result = new ArrayList<>();
    List<HashMap<Character, Integer>> strCounts = new ArrayList<>();
    for (String str : strs) {
      HashMap<Character, Integer> counts = new HashMap<>();
      for (char letter : str.toCharArray()) {
        Integer count = counts.get(letter);
        count = (count == null) ? 1 : count + 1;
        counts.put(letter, count);
      }
      strCounts.add(counts);
    }
    for (int i = 0; i < strs.length; i++) {
      List<String> anagrams = new ArrayList<>();
      HashMap<Character, Integer> thisCount = strCounts.get(i);
      if (thisCount != null) {
        anagrams.add(strs[i]);
        for (int j = 0; j < strs.length; j++) {
          HashMap<Character, Integer> thatCount = strCounts.get(j);
          if (i != j && strs[i].length() == strs[j].length() && thatCount != null) {
            boolean match = true;
            for (Character letter : thisCount.keySet()) {
              Integer count = thisCount.get(letter);
              if (thatCount.get(letter) != count) {
                match = false;
                break;
              }
            }
            if (match) {
              strCounts.set(j, null);
              anagrams.add(strs[j]);
            }
          }
        }
        result.add(anagrams);
        strCounts.set(i, null);
      }
    }
    return result;
  }


}
