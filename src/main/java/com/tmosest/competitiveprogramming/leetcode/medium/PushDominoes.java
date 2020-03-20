package com.tmosest.competitiveprogramming.leetcode.medium;

class PushDominoes {

  String pushDominoes(String dominoes) {
    int[] fromL = new int[dominoes.length()];
    int[] fromR = new int[dominoes.length()];

    int counter = 100000;
    for (int i = 0; i < dominoes.length(); i++) {
      if (dominoes.charAt(i) == 'R') {
        counter = 0;
      }
      if (dominoes.charAt(i) == 'L') {
        counter = 100000;
      }
      fromR[i] = counter;
      counter += counter > 10000 ? 0 : 1;
    }

    counter = 100000;

    for (int i = dominoes.length() - 1; i >= 0; i--) {
      if (dominoes.charAt(i) == 'L') {
        counter = 0;
      }
      if (dominoes.charAt(i) == 'R') {
        counter = 100000;
      }
      fromL[i] = counter;
      counter += counter > 10000 ? 0 : 1;
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < dominoes.length(); i++) {
      if (fromL[i] < fromR[i]) {
        sb.append("L");
      } else if (fromL[i] > fromR[i]) {
        sb.append("R");
      } else {
        sb.append(".");
      }
    }

    return sb.toString();
  }
}
