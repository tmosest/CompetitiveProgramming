package com.tmosest.competitiveprogramming.utils;

public class JavaFileBuilder {

  private static JavaFileBuilder instance = new JavaFileBuilder();

  public static JavaFileBuilder instance() {
    return instance;
  }

  private JavaFileBuilder() {}

  /**
   * Create a new Java File.
   * @param source Where the file will go.
   * @param className The name of the new file.
   */
  public void create(Class source, String className) {
    try {
      new JavaFile(source, className).toFile(className);
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  /**
   * Creates a new java file.
   * @param source The package destination.
   * @param className The class name.
   * @param functionDeclaration public void String someFunction(String str).
   */
  public void create(Class source, String className, String functionDeclaration) {
    try {
      new JavaFile(source, className, functionDeclaration).toFile(className);
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  /**
   * Creates a new test file.
   * @param source The package destination.
   * @param className The class name.
   * @param annotations The annotations.
   * @param values The values for the annotations.
   */
  public void createTest(Class source, String className, String[] annotations, String[] values) {
    if (annotations == null || values ==  null || annotations.length != values.length) {
      return;
    }
    try {
      JavaFile javaFile = new JavaFile(source, className + "Test");
      for (int i = 0; i < annotations.length; i++) {
        javaFile.addNewAnnotation(annotations[i], values[i]);
      }
      String[] testImports = {
          "org.junit.jupiter.api.Assertions",
          "org.junit.jupiter.api.DisplayName",
          "org.junit.jupiter.api.Tag",
          "org.junit.jupiter.api.Test"
      };
      for (String imp : testImports) {
        javaFile.addNewImport(imp);
      }
      javaFile.toTestFile(className + "Test");
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
