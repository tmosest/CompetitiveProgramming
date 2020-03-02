package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

class DifferentWaysToAddParentheses {

  List<Integer> diffWaysToCompute(String str) {
    List<Integer> res = new ArrayList<>();
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*') {
        String spart1 = str.substring(0, i);
        String spart2 = str.substring(i + 1);
        List<Integer> lvs = diffWaysToCompute(spart1);
        List<Integer> rvs = diffWaysToCompute(spart2);
        int val;
        for (int lv : lvs) {
          for (int rv : rvs) {
            if (str.charAt(i) == '+') {
              val = lv + rv;
            } else if (str.charAt(i) == '-') {
              val = lv - rv;
            } else {
              val = lv * rv;
            }
            res.add(val);
          }
        }
      }
    }
    if (res.size() == 0) {
      res.add(Integer.valueOf(str));
    }
    return res;
  }
}
