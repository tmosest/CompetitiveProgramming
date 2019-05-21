package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

class RemoveComments {
  /* Write code here. */

  /**
   * Remove the comments from source code.
   *
   * @param source The source code.
   * @return List of strings which is the new source code.
   */
  public List<String> removeComments(String[] source) {
    List<String> result = new ArrayList<>();
    if (source == null || source.length < 1) {
      return result;
    }
    boolean isMultiLineComment = false;
    StringBuilder stringBuilder = new StringBuilder();
    for (String line : source) {
      int start = 0;
      int end = line.length();
      if (isMultiLineComment) {
        int multiLineEnd = line.indexOf("*/");
        int falseMultiLineEnd = line.indexOf("/*/");
        if (multiLineEnd == -1 || multiLineEnd == falseMultiLineEnd) {
          continue;
        }
        start = multiLineEnd + 2;
        isMultiLineComment = false;
        int commentIndex = line.indexOf("//", multiLineEnd + 2);
        end = (commentIndex > -1) ? commentIndex : line.length();
      } else {
        int multiLineStart = line.indexOf("/*");
        int commentIndex = line.indexOf("//");
        if ((multiLineStart > -1 && commentIndex == -1)
            || (multiLineStart > -1 && commentIndex > -1 && multiLineStart < commentIndex)
            ) {
          isMultiLineComment = true;
          end = multiLineStart;
          int multiLineEnd = line.indexOf("*/", multiLineStart + 2);
          int falseMultiLineEnd = line.indexOf("/*/", multiLineStart + 2);
          if (multiLineEnd > -1 && falseMultiLineEnd != multiLineEnd) {
            char[] lineArray = line.toCharArray();
            for (int i = 0; i < Math.min(lineArray.length, multiLineStart); i++) {
              stringBuilder.append(lineArray[i]);
            }
            commentIndex = line.indexOf("//", multiLineEnd + 2);
            end = (commentIndex > -1) ? commentIndex : lineArray.length;
            for (int i = multiLineEnd + 2; i < end; i++) {
              stringBuilder.append(lineArray[i]);
            }
            if (stringBuilder.length() > 0) {
              result.add(stringBuilder.toString());
              stringBuilder = new StringBuilder();
            }
            isMultiLineComment = false;
            continue;
          }
        } else if (commentIndex > -1) {
          end = commentIndex;
        }
      }
      char[] lineArray = line.toCharArray();
      for (int i = start; i < Math.min(lineArray.length, end); i++) {
        stringBuilder.append(lineArray[i]);
      }
      if (!isMultiLineComment) {
        if (stringBuilder.length() > 0) {
          result.add(stringBuilder.toString());
          stringBuilder = new StringBuilder();
        }
      }
    }
    if (stringBuilder.length() > 0) {
      result.add(stringBuilder.toString());
    }
    return result;
  }


}
