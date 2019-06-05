package com.tmosest.competitiveprogramming.utils.number;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralUtil {

  private Map<Character, Integer> romanValues;

  private RomanNumeralUtil() {
    romanValues = new HashMap<>();
    romanValues.put('I', 1);
    romanValues.put('V', 5);
    romanValues.put('X', 10);
  }

  private static RomanNumeralUtil instance = new RomanNumeralUtil();

  /**
   * Get an instance of the Roman Numeral Utility function.
   * @return Singleton RomanNumeralUtil.
   */
  public static RomanNumeralUtil instance() {
    return instance;
  }

  /**
   * Determine if a string is made up of roman number numbers.
   * @param roman The String (IIV).
   * @return True if made up of roman characters.
   */
  public boolean isRoman(String roman) {
    for (Character letter : romanValues.keySet()) {
      roman = roman.replace("" + letter, "");
    }
    return roman.length() == 0;
  }

  /**
   * Get an integer from a roman numeral.
   * @param roman The Roman String.
   * @return The value. ie. IV -> 4.
   */
  public int fromRoman(String roman) {
    int result = 0;
    char[] letters = roman.toCharArray();
    for (int c = 0; c < letters.length; c++) {
      char letter = letters[c];
      char nextLetter = ' ';
      if (c + 1 < letters.length) {
        nextLetter = letters[c + 1];
      }
      switch (letter) {
        case 'X':
          result += 10;
          break;
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
