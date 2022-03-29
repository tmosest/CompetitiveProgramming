package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class HydrothermalVenture {

  private static Map<String, Integer> counts;

  int countVentOverlaps(List<String> input, boolean includeDiagnols) {
    List<Line> lines = new ArrayList<>();
    for (String in : input) {
      lines.add(Line.fromStr(in));
    }
    counts = new HashMap<>();
    for (Line line : lines) {
      if (!includeDiagnols && !line.isHorizontalorVertical()) {
        continue;
      }
      for (String point : line.getPoints()) {
        int count = counts.getOrDefault(point, 0);
        counts.put(point, count + 1);
      }
    }
    return (int) counts.values().stream().filter(val -> val > 1).count();
  }

  private static class Line {

    int startX;
    int startY;
    int endX;
    int endY;

    private Line(int startX, int startY, int endX, int endY) {
      this.startX = startX;
      this.startY = startY;
      this.endX = endX;
      this.endY = endY;
    }

    static Line fromStr(String line) {
      String[] values = line.split("->");
      for (int i = 0; i < values.length; i++) {
        values[i] = values[i].trim();
      }
      int[] startValues = Arrays.stream(values[0].split(",")).mapToInt(Integer::parseInt).toArray();
      int[] endValues = Arrays.stream(values[1].split(",")).mapToInt(Integer::parseInt).toArray();
      return new Line(startValues[0], startValues[1], endValues[0], endValues[1]);
    }

    public boolean isHorizontalorVertical() {
      return startX == endX || startY == endY;
    }

    public List<String> getPoints() {
      List<String> results = new ArrayList<>();
      int tmpX = startX;
      int tmpY = startY;

      while (tmpX != endX || tmpY != endY) {
        results.add(tmpX + "," + tmpY);
        if (tmpX < endX) {
          ++tmpX;
        }
        if (endX < tmpX) {
          --tmpX;
        }
        if (tmpY < endY) {
          ++tmpY;
        }
        if (endY < tmpY) {
          --tmpY;
        }
        if (tmpX == endX && tmpY == endY) {
          results.add(tmpX + "," + tmpY);
          break;
        }
      }

      return results;
    }
  }
}
