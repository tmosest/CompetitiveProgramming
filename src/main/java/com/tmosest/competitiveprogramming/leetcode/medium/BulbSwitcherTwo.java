package com.tmosest.competitiveprogramming.leetcode.medium;

class BulbSwitcherTwo {

  int flipLights(int lights, int operations) {
    lights = Math.min(lights, 3);
    if (operations == 0) {
      return 1;
    }
    if (operations == 1) {
      return lights == 1 ? 2 : lights == 2 ? 3 : 4;
    }
    if (operations == 2) {
      return lights == 1 ? 2 : lights == 2 ? 4 : 7;
    }
    return lights == 1 ? 2 : lights == 2 ? 4 : 8;
  }
}
