package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.utils.FileUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class LeetCodeOrganizer {

  private static LeetCodeOrganizer instance = new LeetCodeOrganizer();

  private LeetCodeOrganizer() {}

  private FileUtil fileUtil = FileUtil.instance();

  private String getLeetCodePath() {
    return fileUtil.getAbsolutePath(LeetCodeOrganizer.class);
  }

  private String getLeetCodeTestPath() {
    return fileUtil.getAbsoluteTestPath(LeetCodeOrganizer.class);
  }

  private List<String> getFiles() {
    return fileUtil.fileNamesInDirectory(getLeetCodePath());
  }

  private List<String> getTestFiles() {
    return fileUtil.fileNamesInDirectory(getLeetCodeTestPath());
  }

  private enum ProblemDifficulty {
    unknown, easy, medium, hard
  }

  private ProblemDifficulty getDifficultyFromTagName(String tag) {
    switch (tag.trim().toLowerCase()) {
      case "@tag(\"easy\")":
        return ProblemDifficulty.easy;
      case "@tag(\"medium\")":
        return ProblemDifficulty.medium;
      case "@tag(\"hard\")":
        return ProblemDifficulty.hard;
      default:
        return ProblemDifficulty.unknown;
    }
  }

  private String removeTestSuffix(String testFileName) {
    return testFileName.replace("Test", "");
  }

  private String absoluteFilePath(String testFileName) {
    return instance.getLeetCodePath() + removeTestSuffix(testFileName);
  }

  private String absoluteTestFilePath(String testFileName) {
    return instance.getLeetCodeTestPath() + testFileName;
  }

  private ProblemDifficulty getDifficulty(String testFileName) throws IOException {
    File file = new File(absoluteTestFilePath(testFileName));
    BufferedReader reader = new BufferedReader(new FileReader(file));
    ProblemDifficulty difficulty;
    while ((difficulty = getDifficultyFromTagName(reader.readLine())) == ProblemDifficulty.unknown) {}
    reader.close();
    return difficulty;
  }

  private String destinationTestPath(ProblemDifficulty problemDifficulty) {
    return getLeetCodeTestPath() + problemDifficulty.name() + "/";
  }

  private String destinationPath(ProblemDifficulty problemDifficulty) {
    return getLeetCodePath() + problemDifficulty.name() + "/";
  }

  private String destinationTestPathWithName(String testFileName) throws IOException {
    return destinationTestPath(getDifficulty(testFileName)) + testFileName;
  }

  private String destinationPathWithName(String testFileName) throws  IOException {
    return destinationPath(getDifficulty(testFileName)) + removeTestSuffix(testFileName);
  }

  private boolean moveFile(String testFileName) throws  IOException {
    String fileSource = absoluteFilePath(testFileName);
    String fileDestination = destinationPathWithName(testFileName);
    String testFileSource = absoluteTestFilePath(testFileName);
    String testFileDestination = destinationTestPathWithName(testFileName);
    boolean movedFile = fileUtil.moveFile(fileSource, fileDestination);
    boolean movedTestFile = fileUtil.moveFile(testFileSource, testFileDestination);
    return movedFile && movedTestFile;
  }

  private void organizeProblemFiles() {
    System.out.println("Path to this is : " + instance.getLeetCodeTestPath());
    for (String testFileName : instance.getTestFiles()) {
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
