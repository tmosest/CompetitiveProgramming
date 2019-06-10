package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

class EncodeAndDecodeStrings {

  /**
   * Encode multiple string into one.
   *
   * @param strs A list of strings.
   * @return That list encoded.
   */
  String encode(List<String> strs) {
    StringBuilder cods = new StringBuilder();
    for (String st : strs) {
      StringBuilder revst = new StringBuilder();
      revst.append(st);
      cods.append(revst.length() + "|" + revst.reverse().toString());
    }
    return cods.toString();
  }

  /**
   * Decode a string.
   *
   * @param str String to decode.
   * @return A list of strings.
   */
  List<String> decode(String str) {
    List<String> resList = new ArrayList<>();
    int left = 0;
    int right = 0;
    while (right < str.length()) {
      StringBuilder re = new StringBuilder();
      if (str.charAt(right) == '|') {
        int length = Integer.valueOf(str.substring(left, right));
        re.append(str.substring(right + 1, right + 1 + length));
        resList.add(re.reverse().toString());
        left = right + 1 + length;
        right = left;
      }
      right++;
    }
    return resList;
  }
}
