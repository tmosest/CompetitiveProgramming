package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.List;
import java.util.stream.Collectors;

class BinaryDiagnostic {

  private int fromBinaryString(String binaryStr) {
    int result = 0;
    int powTwo = 1;

    for (int i = binaryStr.length() - 1; i >= 0; i--) {
      char digit = binaryStr.charAt(i);
      result += powTwo * (digit - '0');
      powTwo *= 2;
    }

    return result;
  }

  private int[][] getCounts(List<String> input) {
    int[] zeroCounts = new int[input.get(0).length()];
    int[] oneCounts = new int[input.get(0).length()];

    for (String num : input) {
      for (int i = 0; i < num.length(); i++) {
        if (num.charAt(i) == '0') {
          zeroCounts[i]++;
          continue;
        }
        oneCounts[i]++;
      }
    }

    return new int[][]{
        zeroCounts,
        oneCounts
    };
  }

  int multiplicationFromBitCounting(List<String> input) {
    int[][] counts = getCounts(input);
    StringBuilder sbMax = new StringBuilder();
    StringBuilder sbMin = new StringBuilder();
    for (int i = 0; i < counts[0].length; i++) {
      if (counts[0][i] > counts[1][i]) {
        sbMax.append('0');
        sbMin.append('1');
        continue;
      }
      sbMax.append('1');
      sbMin.append('0');
    }

    return fromBinaryString(sbMax.toString()) * fromBinaryString(sbMin.toString());
  }

  private int getValue(List<String> input, boolean isMax, int index) {
    if (input.size() == 1) {
      return fromBinaryString(input.get(0));
    }
    int[][] counts = getCounts(input);

    int tmp = counts[0][index] < counts[1][index] ? 0 : 1;
    if (counts[0][index] == counts[1][index]) {
      tmp = 0;
    }
    if (isMax) {
      tmp = counts[0][index] > counts[1][index] ? 0 : 1;
      if (counts[0][index] == counts[1][index]) {
        tmp = 1;
      }
    }
    final int search = tmp;

    List<String> nextList = input.stream()
        .filter(str -> str.charAt(index) - '0' == search)
        .collect(Collectors.toList());

    return getValue(nextList, isMax, index + 1);
  }

  int recursiveFilter(List<String> input) {
    return getValue(input, true, 0) * getValue(input, false, 0);
  }
}
