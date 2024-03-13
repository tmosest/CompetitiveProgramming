package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class LetterCombinationsOfAPhoneNumber {

  /**
   * Function to convert a phone number to the letters of the keys.
   * Time Complexity is O(N^4) and Space complexity is O(N) where N is the number
   * of digits.
   * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
   * 
   * @param digits String of numbers.
   * @return A List of all letter combinations.
   */
  public List<String> letterCombinations(String digits) {
    List<String> result = new ArrayList<>();

    if (digits == null || digits.length() == 0) {
      return result;
    }

    recursive(digits, result, 0);

    return result;
  }

  private void recursive(String digits, List<String> result, int index) {

    if (index >= digits.length()) {
      return;
    }

    char digit = digits.charAt(index);
    String letters = getLettersForDigit(digit);

    if (result.isEmpty()) {
      for (char letter : letters.toCharArray()) {
        result.add("" + letter);
      }
      recursive(digits, result, index + 1);
      return;
    }

    List<String> resultsNew = new ArrayList<>();

    for (String s : result) {
      for (char letter : letters.toCharArray()) {
        resultsNew.add(s + letter);
      }
    }

    result.clear();
    result.addAll(resultsNew);

    recursive(digits, result, index + 1);
  }

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
}
