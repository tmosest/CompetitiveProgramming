package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.general.ProblemType.Contests;
import com.tmosest.competitiveprogramming.general.ProblemType.Difficulty;
import com.tmosest.competitiveprogramming.general.ProblemType.Types;
import com.tmosest.competitiveprogramming.utils.files.JavaFileBuilder;
import com.tmosest.competitiveprogramming.utils.files.JavaFileData;
import com.tmosest.competitiveprogramming.utils.files.JavaFileMethod;
import com.tmosest.competitiveprogramming.utils.files.JavaMethodData;
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

  public static class Params {

  }

  /**
   * Function to create new code for leet code problems.
   *
   * @param numberName          The title of the question in the format (#.
   *                            Title).
   * @param functionDeclaration The function declaration.
   * @param difficulty          The difficulty of the question.
   */
  public void createNewProblem(LeetCodeProblemData leetCodeProblemData) {
    
    JavaFileMethod javaFileMethod = JavaFileMethod.fromString(leetCodeProblemData.getFormattedFunctionDeclaration());
    
    JavaFileData.JavaFileDataBuilder builder = JavaFileData.builder()
      .name(leetCodeProblemData.getName());

    JavaFileData fileData = builder.build();

    javaFileBuilder.create(LeetCodeGenerator.class, fileData.getFileName(), javaFileMethod);

    List<String> tags = new ArrayList<>(Arrays.asList(
        "Tag",
        "Tag",
        "DisplayName"));
    List<String> vals = new ArrayList<>(Arrays.asList(
        "leetcode",
        leetCodeProblemData.getDifficulty(),
        "LeetCode: " + leetCodeProblemData.getNumberName().replace("\n", "")));

    if (leetCodeProblemData.getTypes() != null) {
      for (String type : leetCodeProblemData.getTypes()) {
        tags.add(2, "Tag");
        vals.add(2, type);
      }
    }

    if (leetCodeProblemData.getContest() != null) {
      tags.add(3, "Tag");
      vals.add(3, leetCodeProblemData.getContest());
    }

    javaFileBuilder.createTest(LeetCodeGenerator.class, fileData.getFileName(), tags, vals, javaFileMethod, leetCodeProblemData.getLeetCodeExamples());
    LeetCodeOrganizer.instance.organizeProblemFiles();
  }

  /**
   * Run this function to generate files.
   *
   * @param args Command line.... not needed.
   */
  public static void main(String[] args) {
    String name = "3622. Check Divisibility by Digit Sum and Product";
    String functionDeclaration = "public boolean checkDivisibility(int n)";
    String difficulty = Difficulty.easy.name();
    List<String> types = Arrays.asList(
        Types.math.name());
    String contest = Contests.wc459.name();

    LeetCodeProblemData problemData = LeetCodeProblemData.builder()
      .numberName(name)
      .functionDeclaration(functionDeclaration)
      .difficulty(difficulty)
      .types(types)
      .contest(contest).build();

    instance().createNewProblem(problemData);
    System.out.println(String.format("%s created.", name));
  }
}
