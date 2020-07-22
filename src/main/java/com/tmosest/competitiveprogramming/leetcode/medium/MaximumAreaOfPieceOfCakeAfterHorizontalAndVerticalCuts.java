package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class MaximumAreaOfPieceOfCakeAfterHorizontalAndVerticalCuts {

  int maxArea(int height, int width, int[] horizontalCuts, int[] verticalCuts) {
    Arrays.sort(horizontalCuts);
    Arrays.sort(verticalCuts);

    List<Integer> hozDiffs = setupDiffList(horizontalCuts, height);
    List<Integer> vertDiffs = setupDiffList(verticalCuts, width);

    Collections.sort(hozDiffs);
    Collections.sort(vertDiffs);

    long maxWidth = (long) hozDiffs.get(hozDiffs.size() - 1);
    long maxHeight = (long) vertDiffs.get(vertDiffs.size() - 1);

    return (int) (maxWidth * maxHeight % (int) (1e9 + 7));
  }


  private List<Integer> setupDiffList(int[] cuts, int limit) {
    List<Integer> diffs = new ArrayList<>();

    for (int i = 0; i < cuts.length; i++) {
      int curr = cuts[i];

      if (i == 0) {
        diffs.add(curr);
      }

      if (i == cuts.length - 1) {
        diffs.add(limit - curr);
      }

      if (i + 1 < cuts.length) {
        diffs.add(cuts[i + 1] - curr);
      }
    }

    return diffs;
  }
}
