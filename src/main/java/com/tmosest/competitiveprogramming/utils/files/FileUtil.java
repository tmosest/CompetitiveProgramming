package com.tmosest.competitiveprogramming.utils.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

  private FileUtil() {
  }

  private static FileUtil instance = new FileUtil();

  public static FileUtil instance() {
    return instance;
  }

  /**
   * Gets all the files in a directory.
   * @param directory The directory path.
   * @return A list of file names.
   */
  public List<String> fileNamesInDirectory(String directory) {
    File folder = new File(directory);
    File[] listOfFiles = folder.listFiles();
    List<String> fileNames = new ArrayList<>();
    for (File file : listOfFiles) {
      fileNames.add(file.getName());
    }
    return fileNames;
  }

  private String getCurrentDir() {
    return System.getProperty("user.dir");
  }

  String getPackage(Class className) {
    return className.getName();
  }

  public String getPathToThis(Class className) {
    return getPackage(className).replace(".", "/").replace(className.getSimpleName(), "");
  }

  public String getAbsolutePath(Class className) {
    return getCurrentDir() + "/src/main/java/" + getPathToThis(className);
  }

  public String getAbsoluteTestPath(Class className) {
    return getCurrentDir() + "/src/test/java/" + getPathToThis(className);
  }

  boolean createNewFile(Class location, String fileName) throws IOException {
    String source = getAbsolutePath(location);
    File file = new File(source, fileName);
    return file.createNewFile();
  }

  boolean createNewTestFile(Class location, String fileName) throws IOException {
    String source = getAbsoluteTestPath(location);
    File file = new File(source, fileName);
    return file.createNewFile();
  }

  public boolean createFile(String path, String fileName) throws IOException {
    return new File(path, fileName).createNewFile();
  }

  private void write(
      Class location,
      String fileName,
      List<String> lines,
      boolean isTest
  ) throws IOException {
    String path = (isTest) ? getAbsoluteTestPath(location) : getAbsolutePath(location);
    write(path, fileName, lines);
  }

  /**
   * Write to a file.
   * @param path The path of the file.
   * @param fileName The file name of the file.
   * @param lines The lines to write to the file.
   * @throws IOException If it cannot write to the file.
   */
  public void write(
      String path,
      String fileName,
      List<String> lines
  ) throws IOException {
    FileWriter fileWriter = new FileWriter(path + fileName);
    PrintWriter printWriter = new PrintWriter(fileWriter);
    for (String line : lines) {
      printWriter.println(line);
    }
    printWriter.close();
  }

  void write(Class location, String fileName, List<String> lines) throws IOException {
    write(location, fileName, lines, false);
  }

  void writeTest(Class location, String fileName, List<String> lines) throws IOException {
    write(location, fileName, lines, true);
  }

  /*
  public boolean moveFile(String oldPath, String newPath) {
    File file = new File(oldPath);
   return new File(oldPath).renameTo(new File(newPath)) && file.delete();
  }
  */

  public boolean deleteFile(String pathToFile) {
    File file = new File(pathToFile);
    return file.exists() && file.delete();
  }
}
