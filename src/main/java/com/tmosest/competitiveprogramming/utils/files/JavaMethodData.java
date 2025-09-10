package com.tmosest.competitiveprogramming.utils.files;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Builder
public class JavaMethodData {
    @Getter private String methodName;
    @Getter private String accessSpecifier;
    @Getter private List<String> comments;
    @Getter private List<String> declarations;
    /*
  private List<String> comments = new ArrayList<>();
  private List<Declaration> declarations = new ArrayList<>();
  private String returnType = "";
  private String methodName = "";
  private String methodContent = "";
  private List<String> parameters = new ArrayList<>();
  private List<String> exceptions = new ArrayList<>();
  */
}
