package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;

class UncommonWordsFromTwoSentences {
  /* Write code here. */

  private void countWords(String sentence, HashMap<String, Integer> counts) {
    String[] words = sentence.split(" ");
    for (String word : words) {
      Integer count = counts.get(word);
      count = (count == null) ? 1 : count + 1;
      counts.put(word, count);
    }
  }

  /**
   * Find words that only appear once.
   *
   * @param sentenceA First sentence.
   * @param sentenceB Second sentence.
   * @return Return a word if it only appears once in total including both sentences.
   */
  public String[] uncommonFromSentences(String sentenceA, String sentenceB) {
    HashMap<String, Integer> map = new HashMap<>();
    countWords(sentenceA, map);
    countWords(sentenceB, map);
    ArrayList<String> result = new ArrayList<>();
    for (String word : map.keySet()) {
      if (map.get(word) == 1) {
        result.add(word);
      }
    }
    return result.toArray(new String[0]);
  }


}
