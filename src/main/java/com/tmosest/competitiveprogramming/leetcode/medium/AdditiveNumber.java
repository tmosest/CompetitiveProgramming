package com.tmosest.competitiveprogramming.leetcode.medium;

class AdditiveNumber {

  boolean isAdditiveNumber(String num) {
    int len = num.length();
    int maxl = num.length() / 2;
    for (int n1 = 1; n1 <= maxl; n1++) {
      if (num.charAt(n1) == '0') {
        if (isAdditiveStr(num.substring(0, n1), "0", num.substring(n1 + 1))) {
          return true;
        }
        continue;
      }
      for (int n2 = 1; n2 <= maxl && (n1 + n2) < len; n2++) {
        if (num.charAt(n1 + n2) == '0') {
          if (num.equals("000")) {
            return true;
          }
          continue;
        }
        if (isAdditiveStr(num.substring(0, n1), num.substring(n1, n1 + n2),
            num.substring(n1 + n2))) {
          return true;
        }
      }
    }
    return false;
  }

  private boolean isAdditiveStr(String num1, String num2, String str) {
    String num3 = addStr(num1, num2);
    while (str.startsWith(num3)) {
      str = str.substring(num3.length());
      if (str.length() == 0) {
        return true;
      }
      num1 = num2;
      num2 = num3;
      num3 = addStr(num1, num2);
    }
    return false;
  }

  private String addStr(String s1, String s2) {
    char[] res = new char[Integer.max(s1.length(), s2.length()) + 1];
    int extra = 0;
    int p1 = s1.length() - 1;
    int p2 = s2.length() - 1;
    int index = res.length - 1;
    while (p1 >= 0 || p2 >= 0) {
      int one = p1 >= 0 ? s1.charAt(p1) - '0' : 0;
      int two = p2 >= 0 ? s2.charAt(p2) - '0' : 0;
      int three = (extra + one + two) % 10;
      extra = (extra + one + two) / 10;
      res[index] = (char) (three + 48);
      index -= 1;
      p1 -= 1;
      p2 -= 1;
    }
    if (extra == 0) {
      return new String(res, 1, res.length - 1);
    } else {
      res[0] = (char) (extra + 48);
      return new String(res);
    }
  }
}
