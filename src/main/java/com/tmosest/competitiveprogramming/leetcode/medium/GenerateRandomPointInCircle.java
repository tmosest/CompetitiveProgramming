package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Random;

class GenerateRandomPointInCircle {

  private double radius;
  private double xcenter;
  private double ycenter;
  private Random random;

  GenerateRandomPointInCircle(double radius, double xcenter, double ycenter) {
    this.radius = radius;
    this.xcenter = xcenter;
    this.ycenter = ycenter;
    this.random = new Random();
  }

  double[] randPoint() {
    double[] ans = new double[2];

    double xcord = Math.random();
    double ycord = Math.random();

    while (xcord * xcord + ycord * ycord > 1) {
      xcord = Math.random();
      ycord = Math.random();
    }

    int flagx = random.nextInt(2) == 0 ? 1 : -1;
    int flagy = random.nextInt(2) == 0 ? 1 : -1;

    ans[0] = xcenter + flagx * radius * xcord;
    ans[1] = ycenter + flagy * radius * ycord;

    return ans;
  }
}
