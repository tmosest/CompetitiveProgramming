package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.utils.JavaFileBuilder;

import java.io.IOException;

public class AaLeetCodeGenerator {

  private static AaLeetCodeGenerator instance = new AaLeetCodeGenerator();

  public static AaLeetCodeGenerator instance() {
    return instance;
  }

  private JavaFileBuilder javaFileBuilder = JavaFileBuilder.instance();

  private AaLeetCodeGenerator() {}

  private String[] formatProblemName(String numberName) {
    return numberName.split("\\.");
  }

  void createNewProblem(
      String numberName,
      String functionDeclaration,
      String difficulty
  ) throws IOException {
    String[] names = instance().formatProblemName(numberName);
    String fileName = names[1].trim().replace(" ", "");
    javaFileBuilder.create(AaLeetCodeGenerator.class, fileName, functionDeclaration);
    String[] tags = {
        "Tag",
        "Tag",
        "DisplayName"
    };
    String[] vals = {
        "leetcode",
        difficulty,
        "LeetCode: " + numberName
    };
    javaFileBuilder.createTest(AaLeetCodeGenerator.class, fileName, tags, vals);
  }

  /**
   * Run this function to generate files.
   * @param args Command line.... not needed.
   */
  public static void main(String[] args) {
    String name = "831. _Masking Personal Information";
    String difficulty = "medium";
    String functionDeclaration = "public String maskPII(String str)";
    try {
      instance().createNewProblem(name, functionDeclaration, difficulty);
      System.out.println(name + " created.");
    } catch (IOException e) {
      System.out.println("Failed to create files for : " + name + " " + e.getMessage());
    }
  }
}
