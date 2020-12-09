package com.tmosest.competitiveprogramming.utils.files;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JavaFileMethod {

  public enum AccessSpecifier {
    PUBLIC, PRIVATE, NONE;

    /**
     * To String.
     * @return To String.
     */
    @Override
    public String toString() {
      return this.name().toLowerCase();
    }

    /**
     * Return the value that should be displayed.
     * @return The display value.
     */
    public String getDisplayValue() {
      if (NONE == this) {
        return "";
      }
      return this.toString();
    }
  }

  public enum Declaration {
    STATIC, ABSTRACT, FINAL, NATIVE, SYNCHRONIZED;

    /**
     * To String.
     * @return To String.
     */
    @Override
    public String toString() {
      return this.name().toLowerCase();
    }

    /**
     * Determines the correct order based on the enum ordering.
     * @return Helps order the declarations for the function.
     */
    public int getOrder() {
      Declaration[] declarations = Declaration.values();
      for (int i = 0; i < declarations.length; i++) {
        if (this == declarations[i]) {
          return i;
        }
      }
      return -1;
    }
  }

  private AccessSpecifier accessSpecifier = AccessSpecifier.NONE;
  private List<Declaration> declarations = new ArrayList<>();
  private String returnType = "";
  private String methodName = "";
  private List<String> parameters = new ArrayList<>();
  private List<String> exceptions = new ArrayList<>();

  public static JavaFileMethod fromString(String function) {
    return new JavaFileMethod(function);
  }

  private JavaFileMethod(String content) {
    String[] contentArray = content.trim()
        .replace("{", "")
        .replace("}", "")
        .replace("\n", "")
        .split(" ");
    int index = 0;
    // Determine access specifier.
    try {
      accessSpecifier = AccessSpecifier.valueOf(contentArray[0].toUpperCase());
      index++;
    } catch (Exception ex) {
      System.out.println("No AccessSpecifier");
    }
    // Determine declarations.
    try {
      while (index < content.length()) {
        Declaration declaration = Declaration.valueOf(contentArray[index]);
        declarations.add(declaration);
        index++;
      }
    } catch (Exception ex) {
      System.out.println("Done with Declarations");
    }
    // Determine return type
    returnType = contentArray[index++];
    // Determine method name
    methodName = contentArray[index++];
    // Need to make sure parameters where not in method name
    if (methodName.indexOf("(") > 0) {
      methodName = methodName.substring(0, methodName.indexOf("("));
    }

    parameters = toParameters(content.substring(
        content.indexOf("("),
        content.indexOf(")")
    ));

    if (content.indexOf("throws") > 0) {
      exceptions = toExceptions(content.substring(content.indexOf("throws")));
    }
  }

  private List<String> toParameters(String parameters) {
    return Arrays.stream(
        parameters
            .replace("(", "")
            .replace(")", "")
            .trim()
            .split(",")
    ).map(String::trim).collect(Collectors.toList());
  }

  private List<String> toExceptions(String parameters) {
    return Arrays.stream(
        parameters
            .replace("throws", "")
            .trim()
            .split(",")
    ).map(String::trim).collect(Collectors.toList());
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();

    stringBuilder.append(accessSpecifier.getDisplayValue());
    stringBuilder.append(" ");

    declarations.sort(Comparator.comparingInt(Declaration::getOrder));
    declarations.forEach(declaration -> {
      stringBuilder.append(declaration.toString());
      stringBuilder.append(" ");
    });

    stringBuilder.append(returnType);
    stringBuilder.append(" ");

    stringBuilder.append(methodName);

    stringBuilder.append("(");
    stringBuilder.append(parameters.stream().reduce((one, two) -> one + ", " + two).orElse(""));
    stringBuilder.append(")");

    if (exceptions.size() > 0) {
      stringBuilder.append(" throws ");
      stringBuilder.append(exceptions.stream().reduce((one, two) -> one + ", " + two).orElse(""));
    }

    stringBuilder.append(" { }");

    return stringBuilder.toString().trim();
  }

  public String getReturnType() {
    return returnType;
  }

  public List<String> getParameters() {
    return parameters;
  }

  public List<String> getExceptions() {
    return exceptions;
  }

  public String getMethodName() {
    return methodName;
  }
}
