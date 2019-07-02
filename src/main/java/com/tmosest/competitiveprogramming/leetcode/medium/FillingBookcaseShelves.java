package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

class FillingBookcaseShelves {

  private Map<Integer, Map<Integer, Map<Integer, Integer>>> map
      = new HashMap<>();

  /**
   * Determine the height of the bookcase give books heights.
   *
   * @param books The book widths and heights.
   * @param shelfWidth The width of the shelf.
   * @return The min height of the book case.
   */
  int minHeightShelves(int[][] books, int shelfWidth) {
    return solve(books, 0, shelfWidth, shelfWidth, 0);
  }

  private int solve(int[][] books, int ind, int spaceAvail, int shelfWidth, int curShelfHeight) {
    if (ind >= books.length) {
      return 0;
    }
    if (map.containsKey(ind) && map.get(ind).containsKey(spaceAvail)
        && map.get(ind).get(spaceAvail).containsKey(curShelfHeight)) {
      return map.get(ind).get(spaceAvail).get(curShelfHeight);
    }

    int val = 0;
    // val1 indicates Put the book at ind in a new shelf
    int val1 = solve(books, ind + 1, shelfWidth - books[ind][0], shelfWidth, books[ind][1])
        + books[ind][1];

    if (spaceAvail < books[ind][0]) {
      // You can only put the book in a new shelf because current shelf doesn't have enought space
      val = val1;
    } else {
      // Current shelf has enough space so you can put the book either in the current shelf
      // or put the book in a new shelf

      // val2 indicates put the book at ind in the current shelf
      int val2 = solve(books, ind + 1, spaceAvail - books[ind][0], shelfWidth,
          Math.max(curShelfHeight, books[ind][1])) + Math.max(curShelfHeight, books[ind][1])
          - curShelfHeight;

      // find min val1, val2
      val = Math.min(val1, val2);
    }

    Map<Integer, Map<Integer, Integer>> subMap1 = map.getOrDefault(ind, new HashMap<>());

    Map<Integer, Integer> subMap2 = subMap1.getOrDefault(spaceAvail, new HashMap<>());
    subMap2.put(curShelfHeight, val);
    subMap1.put(spaceAvail, subMap2);
    map.put(ind, subMap1);

    return val;
  }
}
