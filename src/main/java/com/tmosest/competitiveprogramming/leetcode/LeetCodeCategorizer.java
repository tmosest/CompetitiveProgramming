package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.general.ProblemType.Difficulty;
import com.tmosest.competitiveprogramming.general.ProblemType.Types;
import com.tmosest.competitiveprogramming.utils.files.JavaFile;
import com.tmosest.competitiveprogramming.utils.files.JavaFile.Annotation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeetCodeCategorizer {

  private static LeetCodeCategorizer instance = new LeetCodeCategorizer();

  static LeetCodeCategorizer instance() {
    return instance;
  }

  private LeetCodeFileUtil leetCodeFileUtil;

  private LeetCodeCategorizer() {
    leetCodeFileUtil = LeetCodeFileUtil.instance();
  }

  void printUnknownProblemTypes() throws IOException {
    int index = 1;
    for (Difficulty difficulty : Difficulty.values()) {
      for (String file : leetCodeFileUtil.getTestFiles(difficulty)) {
        String abs = leetCodeFileUtil.absoluteTestFilePath(file, difficulty);
        JavaFile javaFile = new JavaFile(abs);
        List<Annotation> annotations = javaFile.getAnnotations();
        List<String> types = new ArrayList<>();
        for (Annotation annotation : annotations) {
          if (annotation.getName().toLowerCase().equals("tag")) {
            for (Types problemType : Types.values()) {
              if (annotation.getVal().equals(problemType.name())) {
                types.add(problemType.name());
              }
            }
          }
        }
        if (types.size() == 0) {
          System.out.println(index + ") " + file + " " + difficulty);
          index++;
        }
      }
    }
  }

  /**
   * Manual testing.
   * @param args Command line args.
   */
  public static void main(String[] args) throws IOException {
    instance().printUnknownProblemTypes();
  }
}
