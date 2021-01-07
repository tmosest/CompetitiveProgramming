package com.tmosest.competitiveprogramming.leetcode.easy;

class ReformatPhoneNumber {

  String reformatNumber(String number) {
    StringBuilder builder = new StringBuilder(number);
    return addDashes(keepDigits(builder)).toString();
  }

  private static StringBuilder keepDigits(StringBuilder builder) {
    int cursor = 0;
    while (cursor < builder.length()) {
      if (Character.isDigit(builder.charAt(cursor))) {
        cursor++;
      } else {
        builder.deleteCharAt(cursor);
      }
    }
    return builder;
  }

  private static StringBuilder addDashes(StringBuilder builder) {
    int remainingLen = builder.length();
    for (int i = 3; i < builder.length() - 1; i += 4) {
      builder.insert(i, '-');
      remainingLen = builder.length() - (i + 1);
    }

    if (remainingLen == 4) {
      builder.insert(builder.length() - 2, '-');
    }

    return builder;
  }
}
