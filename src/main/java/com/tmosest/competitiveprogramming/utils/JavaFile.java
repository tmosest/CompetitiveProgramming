package com.tmosest.competitiveprogramming.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JavaFile {

  private class Annotation {
    private String name;
    private String val;
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
    packge = source.getPackage().toString();
    this.className = className;
  }

  JavaFile(Class source, String className, String functionDeclaration) {
    this.source = source;
    packge = source.getPackage().toString();
    content = "\t" + functionDeclaration + " {\t\n\t}";
    this.className = className;
  }

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
        if (line.trim().startsWith("class")) {
          imports.add(line.replace("class", "").replace("{", "").trim());
        }
      } else {
        content += line + "\n";
      }
    }
  }

  private void addPackage(List<String> classCode) {
    classCode.add(packge + ";");
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
    classCode.add("\t/* Write code here. */");
    addContent(classCode);
    classCode.add("}");
  }

  private void addContent(List<String> classCode) {
    classCode.add(content);
  }

  public void addNewImport(String imprt) {
    imports.add(imprt);
  }

  public void addNewAnnotation(String name, String val) {
    Annotation annotation = new Annotation();
    annotation.name = name;
    annotation.val = val;
    annotations.add(annotation);
  }

  private void toFile(String fileName, boolean isTest) throws IOException {
    List<String> classCode = new ArrayList<>();
    addPackage(classCode);
    addImports(classCode);
    addAnnotations(classCode);
    addClass(classCode);
    if (isTest) {
      fileUtil.createNewTestFile(source, fileName);
      fileUtil.writeTest(source, fileName, classCode);
    } else {
      fileUtil.createNewFile(source, fileName);
      fileUtil.write(source, fileName, classCode);
    }
  }

  public void toFile(String fileName) throws IOException {
    toFile(fileName, false);
  }

  public void toTestFile(String fileName) throws IOException {
    toFile(fileName, true);
  }

  public boolean moveFile(String destination, boolean isTest) throws IOException {
    if (isTest) {
      toFile(destination);
    } else {
      toTestFile(destination);
    }
    boolean delete = fileUtil.deleteFile(origin);
    origin = destination;
    return delete;
  }

  public String getPackge() {
    return packge;
  }

  public void setPackge(String packge) {
    this.packge = packge;
  }
}
