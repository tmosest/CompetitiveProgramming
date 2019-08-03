package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.utils.files.JavaFileBuilder;
import com.tmosest.competitiveprogramming.utils.string.ClassNameUtil;

import java.io.IOException;

public class LeetCodeGenerator {

  private static LeetCodeGenerator instance = new LeetCodeGenerator();

  /**
   * Get an instance of the singleton.
   * @return An instance of LeetCodeGenerator.
   */
  public static LeetCodeGenerator instance() {
    return instance;
  }

  private JavaFileBuilder javaFileBuilder = JavaFileBuilder.instance();

  private LeetCodeGenerator() {
  }

  /**
   * Function to create new code for leet code problems.
   * @param numberName The title of the question in the format (#. Title).
   * @param functionDeclaration The function declaration.
   * @param difficulty The difficulty of the question.
   * @throws IOException If there is an issues with creating or writing to the function.
   */
  public void createNewProblem(
      String numberName,
      String functionDeclaration,
      String difficulty
  ) throws IOException {
    String[] names = instance().formatIntoNumberAndName(numberName);
    String fileName = ClassNameUtil.instance().convertToClassName(names[1].trim());
    javaFileBuilder.create(LeetCodeGenerator.class, fileName, functionDeclaration);
    String[] tags = {
        "Tag",
        "Tag",
        "DisplayName"
    };
    String[] vals = {
        "leetcode",
        difficulty,
        "LeetCode: " + numberName.replace("\n", "")
    };
    javaFileBuilder.createTest(LeetCodeGenerator.class, fileName, tags, vals);
    LeetCodeOrganizer.instance.organizeProblemFiles();
  }

  // Breaks down "111. Sample Problem Name" into ["111", "Sample Problem Name"]
  private String[] formatIntoNumberAndName(String numberName) {
    return numberName.split("\\.");
  }

  /**
   * Run this function to generate files.
   * @param args Command line.... not needed.
   */
  public static void main(String[] args) {
    String name = "932. Beautiful Array";
    String difficulty = "medium";
    String functionDeclaration = "public int[] beautifulArray(int num)";
    try {
      instance().createNewProblem(name, functionDeclaration, difficulty);
      System.out.println(name + " created.");
    } catch (IOException e) {
      System.out.println("Failed to create files for : " + name + " " + e.getMessage());
    }
  }
}
