package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

class PermutationSequence {

  String getPermutation(int nums, int offset) {
    return generatePermutations(nums).get(offset - 1);
  }

  private List<String> generatePermutations(int nums) {
    List<String> result = new ArrayList<>();
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 1; i <= nums; i++) {
      stringBuilder.append(i);
    }

    for (int i = 0; i < stringBuilder.length(); i++) {
      generatePermutations(result, "", stringBuilder.toString(), i);
    }

    return result;
  }

  private void generatePermutations(
      List<String> permutations,
      String prefix,
      String suffix,
      int index
  ) {
    char digit = suffix.charAt(index);
    prefix += digit;
    suffix = suffix.replace("" + digit, "");

    if (suffix.length() == 0) {
      permutations.add(prefix);
      return;
    }

    for (int i = 0; i < suffix.length(); i++) {
      generatePermutations(permutations, prefix, suffix, i);
    }
  }
}
