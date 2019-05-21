package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

class SentenceSimilarity {
  /* Write code here. */

  /**
   * Determine if two sentences are similar.
   *
   * @param words1 First sentence as an array.
   * @param words2 Second sentence as an array.
   * @param pairs Matrix of string pairs.
   * @return True if the sentences match.
   */
  public boolean areSentencesSimilar(String[] words1, String[] words2, String[][] pairs) {
    if (words1.length != words2.length) {
      return false;
    }

    Set<String> pairSet = new HashSet<>();
    for (String[] pair : pairs) {
      pairSet.add(pair[0] + "#" + pair[1]);
    }

    for (int i = 0; i < words1.length; ++i) {
      if (!words1[i].equals(words2[i])
          && !pairSet.contains(words1[i] + "#" + words2[i])
          && !pairSet.contains(words2[i] + "#" + words1[i])) {
        return false;
      }
    }
    return true;
  }


}
