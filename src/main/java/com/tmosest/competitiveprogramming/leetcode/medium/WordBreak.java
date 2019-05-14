package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class WordBreak {
  /* Write code here. */

  /**
   * Determine if there is a one to one mapping from wordDict to sentence.
   *
   * @param sentence The sentence.
   * @param wordDict The dictionary of words.
   * @return True if there is a one-to-one mapping.
   */
  public boolean wordBreak(String sentence, List<String> wordDict) {
    Set<String> wordDictSet = new HashSet<>(wordDict);
    boolean[] dp = new boolean[sentence.length() + 1];
    dp[0] = true;
    for (int i = 1; i <= sentence.length(); i++) {
      for (int j = 0; j < i; j++) {
        if (dp[j] && wordDictSet.contains(sentence.substring(j, i))) {
          dp[i] = true;
          break;
        }
      }
    }
    return dp[sentence.length()];
  }


}
