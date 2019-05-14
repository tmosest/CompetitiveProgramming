package com.tmosest.competitiveprogramming.utils;

public class ClassNameUtil {

  private static ClassNameUtil classNameUtil = new ClassNameUtil();

  public static ClassNameUtil instance() {
    return classNameUtil;
  }

  private ClassNameUtil() {
  }

  private String convertToProperName(String name) {
    return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
  }

  /**
   * Converts a string to a class name.
   * See unit tests for examples.
   * @param problemName The name of the problem to convert.
   * @return A string in class name format.
   */
  public String convertToClassName(String problemName) {
    String[] names = problemName.split(" ");
    RomanNumeralUtil romanNumeralUtil = RomanNumeralUtil.instance();
    for (int i = 0; i < names.length; i++) {
      if (romanNumeralUtil.isRoman(names[i])) {
        names[i] = String.valueOf(romanNumeralUtil.fromRoman(names[i]));
        continue;
      }
      names[i] = convertToProperName(names[i]);
    }
    return String.join("", names);
  }

  String createTestClassName(String problemName) {
    return convertToClassName(problemName) + "Test";
  }

  /**
   * Method to test this class.
   * @param args main string array.
   */
  public static void main(String[] args) {
    ClassNameUtil classNameUtil = ClassNameUtil.instance();
    String name = "Add One Row to Tree";
    System.out.println(classNameUtil.convertToClassName(name));
    System.out.println(classNameUtil.createTestClassName(name));
  }
}
