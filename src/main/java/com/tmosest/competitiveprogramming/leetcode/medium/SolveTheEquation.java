package com.tmosest.competitiveprogramming.leetcode.medium;

class SolveTheEquation {

  private String coeff(String equat) {
    if (equat.length() > 1 && equat.charAt(equat.length() - 2) >= '0'
        && equat.charAt(equat.length() - 2) <= '9') {
      return equat.replace("left", "");
    }
    return equat.replace("left", "1");
  }

  String solveEquation(String equation) {
    String[] lr = equation.split("=");
    int lhs = 0;
    int rhs = 0;
    for (String x : lr[0].split("(?=\\+)|(?=-)")) {
      if (x.indexOf("left") >= 0) {

        lhs += Integer.parseInt(coeff(x));
      } else {
        rhs -= Integer.parseInt(x);
      }
    }
    for (String x : lr[1].split("(?=\\+)|(?=-)")) {
      if (x.indexOf("left") >= 0) {
        lhs -= Integer.parseInt(coeff(x));
      } else {
        rhs += Integer.parseInt(x);
      }
    }
    if (lhs == 0) {
      if (rhs == 0) {
        return "Infinite solutions";
      } else {
        return "No solution";
      }
    } else {
      return "left=" + rhs / lhs;
    }
  }
}
