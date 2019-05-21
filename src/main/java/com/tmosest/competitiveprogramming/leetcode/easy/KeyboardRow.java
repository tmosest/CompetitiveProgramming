package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

class KeyboardRow {
  /* Write code here. */

  /**
   * Find the longest word that can be written with one row of keys.
   *
   * @param words The array of words.
   * @return The longest word that can written.
   */
  public String[] findWords(String[] words) {
    char[] r1 = new char[]{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
    char[] r2 = new char[]{'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
    char[] r3 = new char[]{'z', 'x', 'c', 'v', 'b', 'n', 'm'};

    int[] table = new int[128];

    for (int i = 0; i < r1.length; i++) {
      table[(int) r1[i]] = 1;
    }

    for (int i = 0; i < r2.length; i++) {
      table[(int) r2[i]] = 2;
    }

    for (int i = 0; i < r3.length; i++) {
      table[(int) r3[i]] = 3;
    }

    List<String> res = new ArrayList<>();
    for (String word : words) {
      int ascV = word.charAt(0);
      if (ascV >= 65 && ascV <= 90) {
        ascV += 32;
      }
      int row = table[ascV];
      int success = 1;
      for (int i = 1; i < word.length(); i++) {
        ascV = word.charAt(i);
        if (ascV >= 65 && ascV <= 90) {
          ascV += 32;
        }
        if (row != table[ascV]) {
          success = 0;
          break;
        }
      }
      if (success == 1) {
        res.add(word);
      }
    }

    String[] arr = new String[res.size()];

    return res.toArray(arr);
  }


}
