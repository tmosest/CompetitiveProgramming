package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class DistantBarcodes {

  /**
   * Rearrange so no adjacent values are the same.
   *
   * @param barcodes The barcode values.
   * @return rearranged array.
   */
  public int[] rearrangeBarcodes(int[] barcodes) {
    int[] result = new int[barcodes.length];
    HashMap<Integer, Integer> counts = new HashMap<>();
    for (int num : barcodes) {
      Integer count = counts.getOrDefault(num, 0);
      counts.put(num, count + 1);
    }
    List<Entry<Integer, Integer>> list = new ArrayList<>(counts.entrySet());
    Collections.sort(list, (one, two) -> two.getValue() - one.getValue());
    Map<Integer, Integer> sortcount = new LinkedHashMap<>();
    for (Map.Entry<Integer, Integer> e : list) {
      sortcount.put(e.getKey(), e.getValue());
    }
    int ri = 0;
    for (Integer item : sortcount.keySet()) {
      for (int x = 1; x <= sortcount.get(item); x++) {
        result[ri] = item;
        ri = ri + 2 >= result.length ? 1 : ri + 2;
      }
    }
    return result;
  }
}
