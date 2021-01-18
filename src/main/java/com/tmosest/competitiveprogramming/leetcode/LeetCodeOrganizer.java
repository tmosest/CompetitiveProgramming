package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.general.ProblemType.Difficulty;
import com.tmosest.competitiveprogramming.utils.files.JavaFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class LeetCodeOrganizer {

  public static LeetCodeOrganizer instance = new LeetCodeOrganizer();

  private LeetCodeFileUtil leetCodeFileUtil;

  private LeetCodeOrganizer() {
    leetCodeFileUtil = LeetCodeFileUtil.instance();
  }

  private Difficulty getDifficulty(String testFileName) throws IOException {
    File file = new File(leetCodeFileUtil.absoluteTestFilePath(testFileName));
    Scanner scanner = new Scanner(file);
    Difficulty difficulty = Difficulty.unknown;
    while (scanner.hasNextLine() && difficulty == Difficulty.unknown) {
      String line = scanner.nextLine().toLowerCase();
      if (line != null && line.startsWith("@tag")) {
        difficulty = Difficulty.fromTag(line);
      }
    }
    return difficulty;
  }

  private String destinationTestPath(Difficulty problemDifficulty) {
    return leetCodeFileUtil.getLeetCodeTestPath() + problemDifficulty.name() + "/";
  }

  private String destinationTestPath(String testFileName) throws IOException {
    return destinationTestPath(getDifficulty(testFileName));
  }

  private String destinationPath(Difficulty problemDifficulty) {
    return leetCodeFileUtil.getLeetCodePath() + problemDifficulty.name() + "/";
  }

  private String destinationPath(String testFileName) throws  IOException {
    return destinationPath(getDifficulty(testFileName));
  }

  private JavaFile updateToCorrectPackage(JavaFile javaFile, String destination) {
    String[] split = destination.split("/");
    String updatedPackage = javaFile.getPackge() + '.' + split[split.length - 1];
    javaFile.setPackge(updatedPackage);
    return javaFile;
  }

  private boolean moveFile(String testFileName) throws  IOException {
    String fileSource = leetCodeFileUtil.absoluteFilePath(testFileName);
    String fileDestination = destinationPath(testFileName);
    JavaFile javaFile = updateToCorrectPackage(
        new JavaFile(fileSource), fileDestination
    );

    String testFileSource = leetCodeFileUtil.absoluteTestFilePath(testFileName);
    String testFileDestination = destinationTestPath(testFileName);
    JavaFile javaTestFile = updateToCorrectPackage(
        new JavaFile(testFileSource), testFileDestination
    );

    boolean movedFile = javaFile.moveFile(fileDestination);
    boolean movedTestFile = javaTestFile.moveFile(testFileDestination);
    return movedFile && movedTestFile;
  }

  /**
   * Look through test files and try to move them to the correct location.
   */
  void organizeProblemFiles() {
    System.out.println("Path to test folder is : " + leetCodeFileUtil.getLeetCodeTestPath());
    for (String testFileName : leetCodeFileUtil.getTestFiles()) {
      System.out.println("File: " + testFileName);
      try {
        moveFile(testFileName);
      } catch (Exception exception) {
        System.out.println("Error with " + exception.getMessage());
      }
    }
  }

  public static void main(String[] args) {
    instance.organizeProblemFiles();
  }
}
