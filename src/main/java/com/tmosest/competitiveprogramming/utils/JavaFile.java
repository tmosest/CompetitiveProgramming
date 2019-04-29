package com.tmosest.competitiveprogramming.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class JavaFile {

  private class Annotation {
    private String name;
    private String val;
  }

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

  void toFile(String fileName) throws IOException {
    toFile(fileName, false);
  }

  void toTestFile(String fileName) throws IOException {
    toFile(fileName, true);
  }
}
