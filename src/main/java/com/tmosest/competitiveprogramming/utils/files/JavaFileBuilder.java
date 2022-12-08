package com.tmosest.competitiveprogramming.utils.files;

import com.tmosest.competitiveprogramming.utils.string.StringUtil;

import java.util.List;

public class JavaFileBuilder {

  private static JavaFileBuilder instance = new JavaFileBuilder();

  private JavaFileBuilder() {
  }

  public static JavaFileBuilder instance() {
    return instance;
  }

  /**
   * Create a new Java File.
   *
   * @param source Where the file will go.
   * @param className The name of the new file.
   */
  public void create(Class source, String className) {
    try {
      new JavaFile(source, className).toFile();
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  /**
   * Creates a new java file.
   *
   * @param source The package destination.
   * @param className The class name.
   * @param functionDeclaration public void String someFunction(String str).
   */
  public void create(Class source, String className, JavaFileMethod functionDeclaration) {
    try {
      new JavaFile(source, className, functionDeclaration).toFile();
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  /**
   * Creates a new test file.
   *
   * @param source The package destination.
   * @param className The class name.
   * @param annotations The annotations.
   * @param values The values for the annotations.
   * @param javaFileMethod The method being tested.
   */
  public void createTest(
      Class source, String className,
      List<String> annotations,
      List<String> values,
      JavaFileMethod javaFileMethod
  ) {
    if (annotations == null || values == null || annotations.size() != values.size()) {
      System.out.println("Empty!");
      return;
    }
    JavaFile javaFile = new JavaFile(source, className + "Test");
    // Create test class for user.
    javaFile
        .addRawContent("private "
            + className
            + " " + StringUtil.uncapitalize(className)
            + ";\n\n");
    // Setup the new test class.
    javaFile.addRawContent("@BeforeEach\nvoid setup() {\n "
        + StringUtil.uncapitalize(className)
        + " = new " + className + "();\n}\n"
    );
    // Add a void test method
    String parameters = javaFileMethod.getParameters().stream()
        .reduce((one, two) -> one + ", " + two).orElse("");
    String parametersNames = javaFileMethod.getParameters().stream()
        .map(str -> {
          if (str.length() < 1) {
            return "";
          }
          return str.split(" ")[1];
        })
        .reduce((one, two) -> one + ", " + two).orElse("");
    javaFile.addRawContent("private void test( "
        + javaFileMethod.getReturnType()
        + " output, " + parameters + ") {\n Assertions.assertEquals(output, "
        + StringUtil.uncapitalize(className) + "." + javaFileMethod.getMethodName() + "("
        + parametersNames + ")); }\n");
    // Add first test
    javaFile.addRawContent("@Test\nvoid test0() {\n test(output, " + parametersNames + "); }\n");
    for (int i = 0; i < annotations.size(); i++) {
      javaFile.addNewAnnotation(annotations.get(i), values.get(i));
    }
    String[] testImports = {
        "org.junit.jupiter.api.Assertions",
        "org.junit.jupiter.api.BeforeEach",
        "org.junit.jupiter.api.DisplayName",
        "org.junit.jupiter.api.Tag",
        "org.junit.jupiter.api.Test"
    };
    for (String imp : testImports) {
      javaFile.addNewImport(imp);
    }
    try {
      javaFile.toTestFile();
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
