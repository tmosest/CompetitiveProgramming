package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class FindAndReplacePattern {

  List<String> findAndReplacePattern(String[] words, String pattern) {
    return Arrays.stream(words)
        .filter(word -> hasIsomorphism(word, pattern))
        .collect(Collectors.toList());
  }

  private boolean hasIsomorphism(String one, String two) {
    if (one == null || two == null) {
      return false;
    }

    if (one.length() != two.length()) {
      return false;
    }

    Map<Character, Character> letterMap = new HashMap<>();
    Map<Character, Character> inverseLetterMap = new HashMap<>();

    char[] oneLetters = one.toCharArray();
    char[] twoLetters = two.toCharArray();

    for (int i = 0; i < oneLetters.length; i++) {
      char oneLetter = oneLetters[i];
      char twoLetter = twoLetters[i];


      char mappedLetter = letterMap.getOrDefault(oneLetter, twoLetter);
      char inverseMappedLetter = inverseLetterMap.getOrDefault(twoLetter, oneLetter);

      if (twoLetter != mappedLetter || oneLetter != inverseMappedLetter) {
        return false;
      }

      letterMap.put(oneLetter, twoLetter);
      inverseLetterMap.put(twoLetter, oneLetter);
    }

    return true;
  }
}
