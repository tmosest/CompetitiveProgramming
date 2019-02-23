package com.tmosest.competitiveprogramming.leetcode;

public class SimilarRgbColor {

  /**
   * Determine a similar color.
   * @param color The input color as a hex string.
   * @return A similar hex color string.
   */
  public String similarRgb(String color) {
    return "#"
        + similar(color.substring(1, 3))
        + similar(color.substring(3, 5))
        + similar(color.substring(5));
  }

  private String similar(String comp) {
    int temp = Integer.parseInt(comp, 16);
    temp = temp / 17 + (temp % 17 > 8 ? 1 : 0);
    return String.format("%02x", 17 * temp);
  }
}
