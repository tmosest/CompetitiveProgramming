package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.utils.UtilTrie;

import java.util.List;

class LongestWordInDictionaryThroughDeleting {
  /* Write code here. */


  /**
   * Determine the longest word that can be created from the dictionary. Using deletion only.
   *
   * @param str The string that can have characters deleted from it.
   * @param dictionary The dictionary of words.
   * @return The longest word from the dictionary that can be made from str.
   */
  public String findLongestWord(String str, List<String> dictionary) {
    return new UtilTrie(str).getLongestWord(dictionary);
  }


}
