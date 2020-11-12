package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class CheckArrayFormationThroughConcatenation {

  boolean canFormArray(int[] arr, int[][] pieces) {
    List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
    for (int[] piece : pieces) {
      List<Integer> pieceList = Arrays.stream(piece).boxed().collect(Collectors.toList());
      if (Collections.indexOfSubList(arrList, pieceList) == -1) {
        return false;
      }
    }
    return true;
  }
}
