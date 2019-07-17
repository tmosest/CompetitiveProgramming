package com.tmosest.competitiveprogramming.leetcode.easy;

class EliminationGame {

  /**
   * Determine what number if left after elimination game.
   *
   * @param num The number.
   * @return The last number remaining.
   */
  int lastRemaining(int num) {
    Range range = new Range(1, num, 1);
    boolean right = true;
    while (range.size() > 1) {
      range = right ? range.moveRight() : range.moveLeft();
      right = !right;
    }
    return range.start;
  }

  private static final class Range {

    int start;

    int end;

    int step;

    Range(int start, int end, int step) {
      this.start = start;
      this.end = end;
      this.step = step;
    }

    int size() {
      return 1 + ((end - start) / step);
    }

    Range moveRight() {
      return new Range(this.start + this.step, size() % 2 == 0 ? this.end : this.end - this.step,
          this.step * 2);
    }

    Range moveLeft() {
      return new Range(size() % 2 == 0 ? this.start : this.start + this.step, this.end - this.step,
          this.step * 2);
    }
  }
}
