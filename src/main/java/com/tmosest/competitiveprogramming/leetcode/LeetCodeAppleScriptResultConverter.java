package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.utils.files.JavaFileBuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LeetCodeAppleScriptResultConverter {

  private static LeetCodeAppleScriptResultConverter instance = new LeetCodeAppleScriptResultConverter();

  /**
   * Get an instance of the singleton.
   *
   * @return An instance of LeetCodeGenerator.
   */
  public static LeetCodeAppleScriptResultConverter instance() {
    return instance;
  }

  private JavaFileBuilder javaFileBuilder = JavaFileBuilder.instance();

  private LeetCodeAppleScriptResultConverter() {
  }

  public String getBaseDir() {
    return System.getProperty("user.dir");
  }

  public String getResultsDir() {
    return getBaseDir() + "/results/";
  }

  public File[] getLeetCodeWeeklyTextFiles() {
    return new File(getResultsDir()).listFiles(new FilenameFilter() {
      @Override
      public boolean accept(File dir, String name) {
        return name.startsWith("leetcode-wc") && name.endsWith(".txt");
      }
    });
  }

  public String getFileContent(String path) {
    String filePath = path; // Replace with your file path
    StringBuilder contentBuilder = new StringBuilder();
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
      String line;
      while ((line = reader.readLine()) != null) {
        contentBuilder.append(line).append(System.lineSeparator());
      }
    } catch (IOException e) {
      e.printStackTrace();
      return "";
    }
    String content = contentBuilder.toString();
    return content;
  }

  /**
   * Run this function to generate files.
   *
   * @param args Command line.... not needed.
   */
  public static void main(String[] args) {
    Map<String, String> contentMap = new HashMap<>();

    List<String> contents = new ArrayList<>();

    for (File file : instance().getLeetCodeWeeklyTextFiles()) {
      // System.out.println(file.getName());
      String content = instance().getFileContent(file.getAbsolutePath());
      contents.add(content);
      contentMap.put("wc" + file.getName().split("-")[2], content);
    }

    for (Entry<String, String> content : contentMap.entrySet()) {
      // System.out.println(content);
      String[] problems = content.getValue().split("=;=;=;");

      for (String problem : problems) {
        String contest = content.getKey(); // Contests.wc459.name();
        
        LeetCodeProblemData leetCodeProblemData = new LeetCodeProblemDataAdapter(contest, problem).getProblemData(); 

        LeetCodeGenerator.instance().createNewProblem(leetCodeProblemData);
      }
    }
  }
}
