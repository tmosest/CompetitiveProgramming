package com.tmosest.competitiveprogramming.utils.string;

import com.google.common.collect.ImmutableMap;

import com.tmosest.competitiveprogramming.utils.number.RomanNumeralUtil;

import java.util.Map;
import java.util.Map.Entry;

public class ClassNameUtil {

  private static ClassNameUtil classNameUtil = new ClassNameUtil();

  public static ClassNameUtil instance() {
    return classNameUtil;
  }

  private static final Map<String, String> ILLEGAL_CHARACTER_MAP =
      new ImmutableMap.Builder<String, String>()
      .put("\n", " ")
      .put(",", "")
      .put("%", " Percent")
      .build();

  private ClassNameUtil() {
  }

  private boolean isValidClassName(String name) {
    if (name == null || name.isEmpty() || !Character.isAlphabetic(name.charAt(0))) {
      return false;
    }
    for (char letter : name.toCharArray()) {
      if (!Character.isSpaceChar(letter) && !Character.isLetterOrDigit(letter)) {
        return false;
      }
    }
    return true;
  }

  /**
   * Converts a string to a class name. See unit tests for examples.
   *
   * @param problemName The name of the problem to convert.
   * @return A string in class name format.
   */
  public String convertToClassName(String problemName) throws IllegalArgumentException {
    for (Entry<String, String> entry : ILLEGAL_CHARACTER_MAP.entrySet()) {
      problemName = problemName.replace(entry.getKey(), entry.getValue());
    }
    String[] names = problemName.split(" ");
    for (int i = 0; i < names.length; i++) {
      if (names[i].contains("-")) {
        String[] split = names[i].split("-");
        if (!split[0].equals("")) {
          names[i] = names[i].replace("-", "");
        }
      }
    }
    RomanNumeralUtil romanNumeralUtil = RomanNumeralUtil.instance();
    for (int i = 0; i < names.length; i++) {
      if (romanNumeralUtil.isRoman(names[i])) {
        names[i] = NumberToWords.numberToWords(romanNumeralUtil.fromRoman(names[i]));
        String[] temp = names[i].split(" ");
        names[i] = String.join("", temp);
        continue;
      }
      try {
        int num = Integer.parseInt(names[i]);
        names[i] = NumberToWords.numberToWords(num);
        String[] temp = names[i].split(" ");
        names[i] = String.join("", temp);
        continue;
      } catch (Exception e) {
        // Was not a number.
      }
      if (names[i].length() < 2 && names.length > 1) {
        names[i] = "";
        continue;
      }
      names[i] = StringUtil.toProperName(names[i]);
    }

    String res = String.join("", names).trim().replace("\n", "");

    // Bad design to wait till the end to do this.
    if (!isValidClassName(res)) {
      throw new IllegalArgumentException("Class name must be alpha numeric with spaces: " + res);
    }

    return res;
  }

  String createTestClassName(String problemName) throws IllegalArgumentException {
    return convertToClassName(problemName) + "Test";
  }

  /**
   * Method to test this class.
   *
   * @param args main string array.
   */
  public static void main(String[] args) throws IllegalArgumentException {
    ClassNameUtil classNameUtil = ClassNameUtil.instance();
    String name = "Add One Row to Tree";
    System.out.println(classNameUtil.convertToClassName(name));
    System.out.println(classNameUtil.createTestClassName(name));
  }
}
