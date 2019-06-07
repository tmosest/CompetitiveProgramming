package com.tmosest.competitiveprogramming.leetcode.medium;

class RectangleArea {

  /**
   * Determine the area of two rectangles.
   * Defined by two points per rect.
   * @param rectOnePointOneX X cord of first point for first rect.
   * @param rectOnePointOneY Y cord of first point for first rect.
   * @param rectOnePointTwoX X cord of 2nd point for first rect.
   * @param rectOnePointTwoY Y cord of 2nd point for first rect.
   * @param rectTwoPointOneX X cord of first point for 2nd rect.
   * @param rectTwoPointOneY Y cord of first point for 2nd rect.
   * @param rectTwoPointTwoX X cord of 2nd point for 2nd rect.
   * @param rectTwoPointTwoY Y cord of 2nd point for 2nd rect.
   * @return The area of the two rectangles.
   */
  public int computeArea(
      int rectOnePointOneX,
      int rectOnePointOneY,
      int rectOnePointTwoX,
      int rectOnePointTwoY,
      int rectTwoPointOneX,
      int rectTwoPointOneY,
      int rectTwoPointTwoX,
      int rectTwoPointTwoY
  ) {
    int[] pointOne = {rectOnePointOneX, rectOnePointOneY};
    int[] pointTwo = {rectOnePointTwoX, rectOnePointTwoY};
    Rectangle rectOne = new Rectangle(pointOne, pointTwo);

    int[] pointThree = {rectTwoPointOneX, rectTwoPointOneY};
    int[] pointFour = {rectTwoPointTwoX, rectTwoPointTwoY};
    Rectangle rectTwo = new Rectangle(pointThree, pointFour);

    return (int) rectOne.combinedArea(rectTwo);
  }

  private class Rectangle {
    int left;
    int right;
    int top;
    int bottom;

    Rectangle(int[] pointOne, int[] pointTwo) {
      left = Math.min(pointOne[0], pointTwo[0]);
      right = Math.max(pointOne[0], pointTwo[0]);
      bottom = Math.min(pointOne[1], pointTwo[1]);
      top = Math.max(pointOne[1], pointTwo[1]);
    }

    long area() {
      return (right - left) * (top - bottom);
    }

    long overLappingArea(Rectangle other) {
      int top = Math.min(this.top, other.top);
      int bottom = Math.max(this.bottom, other.bottom);
      int left = Math.max(this.left, other.left);
      int right = Math.min(this.right, other.right);
      int vertDiff = top - bottom;
      int horizontalDiff = right - left;
      if (vertDiff > 0 && horizontalDiff > 0) {
        return vertDiff * horizontalDiff;
      }
      return 0;
    }

    long combinedArea(Rectangle other) {
      return this.area() + other.area() - this.overLappingArea(other);
    }
  }
}
