package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.general.ProblemType.Contests;
import com.tmosest.competitiveprogramming.general.ProblemType.Difficulty;
import com.tmosest.competitiveprogramming.general.ProblemType.Types;
import com.tmosest.competitiveprogramming.utils.files.JavaFileBuilder;
import com.tmosest.competitiveprogramming.utils.string.ClassNameUtil;

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
      String type,
      String contest
  ) {
    String[] names = instance().formatIntoNumberAndName(numberName);
    String fileName = ClassNameUtil.instance().convertToClassName(names[1].trim());
    javaFileBuilder.create(LeetCodeGenerator.class, fileName, functionDeclaration);
    List<String> tags = Arrays.asList(
        "Tag",
        "Tag",
        "DisplayName"
    );
    List<String> vals = Arrays.asList(
        "leetcode",
        difficulty,
        "LeetCode: " + numberName.replace("\n", "")
    );
    javaFileBuilder.createTest(LeetCodeGenerator.class, fileName, tags, vals);
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
    String name = "1389. Create Target Array in the Given Order";
    String functionDeclaration
        = "int[] createTargetArray(int[] nums, int[] index)";
    String difficulty = Difficulty.easy.name();
    String type = Types.array.name();
    String contest = Contests.wc181.name();


    instance().createNewProblem(name, functionDeclaration, difficulty, type, contest);
    System.out.println(String.format("%s created.", name));
  }
}
