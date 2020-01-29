package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

class FractionAdditionAndSubtraction {

  int gcd(int one, int two) {
    return one % two == 0 ? two : gcd(two, one % two);
  }

  String format(int one, int two) {
    int gcd = Math.abs(gcd(one, two));
    return String.valueOf(one / gcd) + "/" + String.valueOf(two / gcd);
  }

  int[] parse(String str) {
    int idx = str.indexOf("/");
    return new int[]{Integer.parseInt(
        str.substring(0, idx)),
        Integer.parseInt(str.substring(idx + 1))};
  }

  String fractionAddition(String expression) {
    int[] rst = {0, 1};
    List<int[]> list = new ArrayList<>();
    StringBuilder sb = new StringBuilder().append(expression.charAt(0));
    for (int i = 1; i < expression.length(); i++) {
      char letter = expression.charAt(i);
      if (letter == '+' || letter == '-') {
        list.add(parse(sb.toString()));
        sb = new StringBuilder().append(letter);
      } else {
        sb.append(letter);
      }
    }
    list.add(parse(sb.toString()));

    for (int[] num : list) {
      rst = new int[]{rst[0] * num[1] + rst[1] * num[0], rst[1] * num[1]};
    }

    return format(rst[0], rst[1]);
  }
}
