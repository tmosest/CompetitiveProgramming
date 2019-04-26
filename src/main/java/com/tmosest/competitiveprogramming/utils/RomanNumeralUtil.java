package com.tmosest.competitiveprogramming.utils;

import java.util.HashMap;
import java.util.Map;

class RomanNumeralUtil {

  private Map<Character, Integer> romanValues;

  private RomanNumeralUtil() {
    romanValues = new HashMap<>();
    romanValues.put('I', 1);
    romanValues.put('V', 5);
    romanValues.put('X', 10);
  }

  private static RomanNumeralUtil instance = new RomanNumeralUtil();

  static RomanNumeralUtil instance() {
    return instance;
  }

  boolean isRoman(String roman) {
    for (Character letter : romanValues.keySet()) {
      roman = roman.replace("" + letter, "");
    }
    return roman.length() == 0;
  }

  int fromRoman(String roman) {
    int result = 0;
    char[] letters = roman.toCharArray();
    for (int c = 0; c < letters.length; c++) {
      char letter = letters[c];
      char nextLetter = ' ';
      if (c + 1 < letters.length) {
        nextLetter = letters[c + 1];
      }
      switch (letter) {
        case 'V':
          result += 5;
          break;
        default:
          if (nextLetter == 'V') {
            result += 4;
            c++;
          } else if (nextLetter == 'X') {
            result += 9;
            c++;
          } else {
            result += 1;
          }
      }
    }
    return result;
  }
}
