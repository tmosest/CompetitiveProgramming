package com.tmosest.competitiveprogramming.utils;

class ClassNameUtil {

  private static ClassNameUtil classNameUtil = new ClassNameUtil();

  static ClassNameUtil instance() {
    return classNameUtil;
  }

  private ClassNameUtil() {}

  String convertToClassName(String problemName) {
    String[] names = problemName.split(" ");
    for (int i = 0; i < names.length; i++) {
      names[i] = names[i].substring(0, 1).toUpperCase() + names[i].substring(1);
    }
    return String.join("", names);
  }

  String createTestClassName(String problemName) {
    return convertToClassName(problemName) + "Test";
  }

  public static void main(String[] args) {
    ClassNameUtil classNameUtil = ClassNameUtil.instance();
    System.out.println(classNameUtil.convertToClassName("Rabbits in Forest"));
    System.out.println(classNameUtil.createTestClassName("Rabbits in Forest"));
  }
}
