package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LetterCombinationsOfAPhoneNumber {
  public boolean debugMode = false;

  private String getLettersForDigit(char digit) {
    String result = "";
    switch (digit) {
      case '2':
        result = "abc";
        break;
      case '3':
        result = "def";
        break;
      case '4':
        result = "ghi";
        break;
      case '5':
        result = "jkl";
        break;
      case '6':
        result = "mno";
        break;
      case '7':
        result = "pqrs";
        break;
      case '8':
        result = "tuv";
        break;
      case '9':
        result = "wxyz";
        break;
      default:
        result = "";
    }
    return result;
  }

  private void constructLettercombinations(String digits, Set<String> set) {
    if ("".equals(digits)) {
      return;
    }
    char digit = digits.charAt(0);
    String possibleLetters = getLettersForDigit(digit);
    if (debugMode) {
      System.out.println("possibleLetters: " + possibleLetters);
    }
    if (set.isEmpty()) {
      for (int i = 0; i < possibleLetters.length(); i++) {
        set.add(possibleLetters.substring(i, i + 1));
      }
    } else {
      Set<String> newResults = new HashSet<>();
      for (String s : set) {
        for (int i = 0; i < possibleLetters.length(); i++) {
          newResults.add(s + possibleLetters.substring(i, i + 1));
        }
      }
      set.clear();
      set.addAll(newResults);
    }
    String remainder = digits.substring(1, digits.length());
    if (debugMode) {
      System.out.println("remainder: " + remainder);
      for (String s : set) {
        System.out.println(s);
      }
    }

    constructLettercombinations(remainder, set);
  }

  /**
   * Function to convert a phone number to the letters of the keys.
   * @param digits String of numbers.
   * @return A List of all letter combinations.
   */
  public List<String> letterCombinations(String digits) {
    List<String> result = new ArrayList<>();
    if (digits == null && digits.length() < 1) {
      return result;
    }
    Set<String> set = new HashSet<>();
    constructLettercombinations(digits, set);
    if (debugMode) {
      for (String s : set) {
        System.out.println(s);
      }
    }
    result.addAll(set);
    return result;
  }
}
