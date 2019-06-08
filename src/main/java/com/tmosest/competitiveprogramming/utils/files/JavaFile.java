package com.tmosest.competitiveprogramming.utils.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JavaFile {

  public class Annotation {
    private String name;
    private String val;

    private Annotation(String name, String val) {
      this.name = name;
      this.val = val;
    }

    private Annotation(String annotation) {
      int openBracketIndex = annotation.indexOf('(');
      name = annotation.substring(1, openBracketIndex);
      int closeBracketIndex = annotation.indexOf(')', openBracketIndex);
      val = annotation.substring(openBracketIndex + 1, closeBracketIndex).replace("\"","");
    }

    /**
     * Get the name of the annotation.
     * @return The name of the annotation.
     */
    public String getName() {
      return name;
    }

    /**
     * The value of the annotation.
     * @return The value of the annotation.
     */
    public String getVal() {
      return val;
    }
  }

  private String origin = "";
  private Class source = JavaFile.class;
  private String packge = "";
  private String className = "";
  private List<String> imports = new ArrayList<>();
  private String content = "";
  private List<Annotation> annotations = new ArrayList<>();
  private FileUtil fileUtil = FileUtil.instance();

  JavaFile(Class source, String className) {
    this.source = source;
    packge = source.getPackage().toString().replaceFirst("package", "");
    this.className = className;
  }

  JavaFile(Class source, String className, String functionDeclaration) {
    this.source = source;
    packge = source.getPackage().toString().replaceFirst("package", "");
    content = "\t" + functionDeclaration + " {\t\n\t}";
    this.className = className;
  }

  /**
   * Create a Java file from the absolute path of a file.
   * @param absoluteFilePath The absolute path. /C/User/someone/JavaFile.java
   * @throws IOException If it cannot create from the file.
   */
  public JavaFile(String absoluteFilePath) throws IOException {
    origin = absoluteFilePath;
    File file = new File(absoluteFilePath);
    BufferedReader reader = new BufferedReader(new FileReader(file));
    String line;
    while ((line = reader.readLine()) != null) {
      if (className.equals("")) {
        if (line.startsWith("package")) {
          packge = line.replaceFirst("package", "").replace(";", "").trim();
        }
        if (line.trim().startsWith("import") && className.equals("")) {
          imports.add(line.replace("import", "").replace(";", "").trim());
        }
        if (line.trim().contains("class")) {
          className = line
              .replace("class", "")
              .replace("{", "")
              .replace("public", "")
              .trim();
        }
        if (line.trim().startsWith("@")) {
          Annotation annotation = new Annotation(line);
          annotations.add(annotation);
        }
      } else {
        content += line + "\n";
      }
    }
    int lastBracket = content.lastIndexOf('}');
    content = content.substring(0, lastBracket) + "\n";
  }

  private void addPackage(List<String> classCode) {
    classCode.add("package " + packge + ";");
    classCode.add("");
  }

  private void addAnnotations(List<String> classCode) {
    for (Annotation annotation : annotations) {
      classCode.add("@" + annotation.name + "(\"" + annotation.val + "\")");
    }
  }

  private void addImports(List<String> classCode) {
    for (String imp : imports) {
      classCode.add("import " + imp + ";");
    }
    if (imports.size() > 0) {
      classCode.add("");
    }
  }

  private void addClass(List<String> classCode) {
    classCode.add("class " + className + " {");
    addContent(classCode);
    classCode.add("}");
  }

  private void addContent(List<String> classCode) {
    classCode.add(content);
  }

  void addNewImport(String imprt) {
    imports.add(imprt);
  }

  void addNewAnnotation(String name, String val) {
    Annotation annotation = new Annotation(name, val);
    annotations.add(annotation);
  }

  /**
   * Get the annotations for the java file.
   * @return the annotations.
   */
  public List<Annotation> getAnnotations() {
    return annotations;
  }

  private List<String> generateClassCode() {
    List<String> classCode = new ArrayList<>();
    addPackage(classCode);
    addImports(classCode);
    addAnnotations(classCode);
    addClass(classCode);
    return classCode;
  }

  private void toFile(boolean isTest) throws IOException {
    List<String> classCode = generateClassCode();
    String fileName = className + ".java";
    if (isTest) {
      fileUtil.createNewTestFile(source, fileName);
      fileUtil.writeTest(source, fileName, classCode);
    } else {
      fileUtil.createNewFile(source, fileName);
      fileUtil.write(source, fileName, classCode);
    }
  }

  void toFile() throws IOException {
    toFile(false);
  }

  void toTestFile() throws IOException {
    toFile(true);
  }

  /**
   * Moves this JavaFile to another location.
   * @param destination The destination folder.
   * @return True if it was able to move the file.
   * @throws IOException If it couldn't write or do other things to the file.
   */
  public boolean moveFile(String destination) throws IOException {
    List<String> classCode = generateClassCode();
    String fileName = className + ".java";
    fileUtil.createFile(destination, fileName);
    fileUtil.write(destination, fileName, classCode);
    String oldOrigin = origin;
    origin = destination;
    return fileUtil.deleteFile(oldOrigin);
  }

  public String getPackge() {
    return packge;
  }

  public void setPackge(String packge) {
    this.packge = packge;
  }
}
