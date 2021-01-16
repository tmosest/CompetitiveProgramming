package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.general.ProblemType.Contests;
import com.tmosest.competitiveprogramming.general.ProblemType.Difficulty;
import com.tmosest.competitiveprogramming.general.ProblemType.Types;
import com.tmosest.competitiveprogramming.utils.files.JavaFileBuilder;
import com.tmosest.competitiveprogramming.utils.files.JavaFileMethod;
import com.tmosest.competitiveprogramming.utils.string.ClassNameUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCodeGenerator {

  private static LeetCodeGenerator instance = new LeetCodeGenerator();

  /**
   * Get an instance of the singleton.
   *
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
   *
   * @param numberName The title of the question in the format (#. Title).
   * @param functionDeclaration The function declaration.
   * @param difficulty The difficulty of the question.
   */
  public void createNewProblem(
      String numberName,
      String functionDeclaration,
      String difficulty,
      List<String> types,
      String contest
  ) {
    String[] names = instance().formatIntoNumberAndName(numberName);
    String fileName = ClassNameUtil.instance().convertToClassName(names[1].trim());
    JavaFileMethod javaFileMethod = JavaFileMethod.fromString(functionDeclaration);
    javaFileBuilder.create(LeetCodeGenerator.class, fileName, javaFileMethod);
    List<String> tags = new ArrayList<>(Arrays.asList(
        "Tag",
        "Tag",
        "DisplayName"
    ));
    List<String> vals = new ArrayList<>(Arrays.asList(
        "leetcode",
        difficulty,
        "LeetCode: " + numberName.replace("\n", "")
    ));
    if (types != null) {
      for (String type : types) {
        tags.add(2, "Tag");
        vals.add(2, type);
      }
    }
    if (contest != null) {
      tags.add(3, "Tag");
      vals.add(3, contest);
    }
    javaFileBuilder.createTest(LeetCodeGenerator.class, fileName, tags, vals, javaFileMethod);
    LeetCodeOrganizer.instance.organizeProblemFiles();
  }

  // Breaks down "111. Sample Problem Name" into ["111", "Sample Problem Name"]
  private String[] formatIntoNumberAndName(String numberName) {
    return numberName.split("\\.");
  }

  /**
   * Run this function to generate files.
   *
   * @param args Command line.... not needed.
   */
  public static void main(String[] args) {
    String name = "Day 2. Password Philosophy";
    String functionDeclaration = "int findValidPasswords(List<String> inputs)";
    String difficulty = Difficulty.advent.name();
    List<String> types = Arrays.asList(
        Types.string.name()
    );
    String contest = Contests.advent2020.name();

    instance().createNewProblem(name, functionDeclaration, difficulty, types, contest);
    System.out.println(String.format("%s created.", name));
  }
}
