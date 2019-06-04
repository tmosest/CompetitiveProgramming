package com.tmosest.competitiveprogramming;

import com.tmosest.competitiveprogramming.general.ProblemType.Difficulty;
import com.tmosest.competitiveprogramming.general.ProblemType.Site;
import com.tmosest.competitiveprogramming.general.ProblemType.Types;
import com.tmosest.competitiveprogramming.utils.files.FileUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadMeGenerator {

  private static final String templateName = "README.template";
  private static final String indicator = "<!--DYNAMIC_CONTENT-->";

  void generateReadMe() throws IOException {
    System.out.println("Reading Template");
    String readMeFileLocation = FileUtil.instance().getCurrentDir() + "/" + templateName;
    System.out.println("Looking for README.md at " + readMeFileLocation);
    File file = new File(readMeFileLocation);
    BufferedReader reader = new BufferedReader(new FileReader(file));
    String line;
    List<String> lines = new ArrayList<>();
    while ((line = reader.readLine()) != null) {
      if (indicator.equals(line.trim())) {
        lines.add("### Difficulty Levels");
        for (Difficulty difficulty : Difficulty.values()) {
          lines.add("- " + difficulty);
        }
        lines.add("\n### Sites");
        for (Site site : Site.values()) {
          lines.add("- " + site);
        }
        lines.add("\n### Types of Problems");
        for (Types type : Types.values()) {
          lines.add("- " + type);
        }
      } else {
        lines.add(line);
      }
    }
    FileUtil.instance().createFile(FileUtil.instance().getCurrentDir() + "/", "README.md");
    FileUtil.instance().write(FileUtil.instance().getCurrentDir() + "/", "README.md", lines);
  }

  /**
   * Manual testing.
   * @param args Command line args.
   * @throws IOException Throws IOException.
   */
  public static void main(String[] args) throws IOException {
    new ReadMeGenerator().generateReadMe();
  }
}
