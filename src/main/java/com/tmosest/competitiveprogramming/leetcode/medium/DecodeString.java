package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Stack;

class DecodeString {
  /* Write code here. */

  /**
   * Decodes a string.
   *
   * @param str The string to decode.
   * @return The decoded string.
   */
  public String decodeString(String str) {
    char[] strArray = str.toCharArray();
    StringBuilder stringBuilder = new StringBuilder();
    Stack<String> stringStack = new Stack<>();
    Stack<Integer> countStack = new Stack<>();
    int index = 0;
    while (index < strArray.length) {
      if (index < strArray.length && Character.isDigit(strArray[index])) {
        int count = 0;
        while (Character.isDigit(strArray[index])) {
          count *= 10;
          count += (int) strArray[index] - '0';
          index++;
        }
        countStack.push(count);
      }
      if (index < strArray.length && strArray[index] == '[') {
        index++;
        StringBuilder temp = new StringBuilder();
        while (Character.isAlphabetic(strArray[index])) {
          temp.append(strArray[index]);
          index++;
        }
        stringStack.push(temp.toString());
      }
      if (index < strArray.length && strArray[index] == ']') {
        int count = countStack.pop();
        String temp = stringStack.pop();
        StringBuilder tempSb = new StringBuilder();
        for (int i = 0; i < count; i++) {
          tempSb.append(temp);
        }
        if (stringStack.isEmpty()) {
          stringBuilder.append(tempSb.toString());
        } else {
          String last = stringStack.pop();
          tempSb.insert(0, last);
          stringStack.push(tempSb.toString());
        }
        index++;
      }
      if (index < strArray.length && Character.isAlphabetic(strArray[index])) {
        if (stringStack.isEmpty()) {
          stringBuilder.append(strArray[index]);
        } else {
          String last = stringStack.pop();
          stringStack.push(last + strArray[index]);
        }
        index++;
      }
    }
    return stringBuilder.toString();
  }


}
