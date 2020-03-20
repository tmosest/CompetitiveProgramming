package com.tmosest.competitiveprogramming.utils.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixListAdapter<T> {

  private static final MatrixListAdapter<Integer> intAdapter = new MatrixListAdapter<>();

  public static List<List<Integer>> toList(Integer[][] matrix) {
    return intAdapter.convertToLists(matrix);
  }

  /**
   * Converts a matrix into a list of lists.
   * @param matrix The matrix to convert.
   * @return The list of lists.
   */
  public List<List<T>> convertToLists(T[][] matrix) {
    List<List<T>> result = new ArrayList<>();

    for (T[] row : matrix) {
      result.add(Arrays.asList(row));
    }

    return result;
  }
}
