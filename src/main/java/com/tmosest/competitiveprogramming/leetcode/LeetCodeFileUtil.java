package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.general.ProblemType.Difficulty;
import com.tmosest.competitiveprogramming.utils.files.FileUtil;

import java.util.List;

public class LeetCodeFileUtil {

  private static LeetCodeFileUtil instance = new LeetCodeFileUtil();
  private FileUtil fileUtil = FileUtil.instance();

  static LeetCodeFileUtil instance() {
    return instance;
  }

  private LeetCodeFileUtil() {
  }

  /**
   * Path to where leet code starts in this repo.
   * @return The file path.
   */
  String getLeetCodePath() {
    return fileUtil.getAbsolutePath(LeetCodeOrganizer.class);
  }

  /**
   * Path to where leet test code starts in this repo.
   * @return The file path to test code.
   */
  String getLeetCodeTestPath() {
    return fileUtil.getAbsoluteTestPath(LeetCodeOrganizer.class);
  }

  String getLeetCodeTestPath(Difficulty difficulty) {
    return getLeetCodeTestPath() + difficulty + "/";
  }

  String absoluteFilePath(String testFileName) {
    return getLeetCodePath() + testFileName.replace("Test", "");
  }

  String absoluteTestFilePath(String testFileName) {
    return getLeetCodeTestPath() + testFileName;
  }

  String absoluteTestFilePath(String testFileName, Difficulty difficulty) {
    return getLeetCodeTestPath(difficulty) + testFileName;
  }

  /**
   * Get a list of all the test files in the base leet code package.
   * @return list of all files.
   */
  List<String> getTestFiles() {
    return fileUtil.fileNamesInDirectory(getLeetCodeTestPath());
  }

  /**
   * Get test files by difficulty.
   * @param difficulty The difficulty of the problem.
   * @return a list of files for that difficulty
   */
  List<String> getTestFiles(Difficulty difficulty) {
    return fileUtil.fileNamesInDirectory(getLeetCodeTestPath(difficulty));
  }

  /**
   * Manual testing.
   * @param args Command line args.
   */
  public static void main(String[] args) {
  }
}
