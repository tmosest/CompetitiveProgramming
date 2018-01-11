package com.tmosest.competitiveprogramming.crackingcode.arrays;

public class ZeroMatrix {

  public static int[][] zeroMatrix(int[][] matrix) {
    boolean firstRowHasZero = false;
    boolean firstColumnHasZero = false;
    // Check first Row
    for (int i = 0; i < matrix[0].length; i++) {
      if (matrix[0][i] == 0) {
        firstRowHasZero = true;
        break;
      }
    }
    // Check first Column
    for (int i = 0; i < matrix.length; i++) {
      if (matrix[i][0] == 0) {
        firstColumnHasZero = true;
        break;
      }
    }
    // Set Rows and Marks
    for (int r = 1; r < matrix.length; r++) {
      for (int c = 1; c < matrix[0].length; c++) {
        if (matrix[r][c] == 0) {
          matrix[r][0] = 0;
          matrix[c][r] = 0;
        }
      }
    }
    // Nullify rows
    for (int r = 1; r < matrix.length; r++) {
      if (matrix[r][0] == 0) {
        for (int c = 1; c < matrix[0].length; c++) {
          matrix[r][c] = 0;
        }
      }
    }
    // Nullify columns
    for (int c = 1; c < matrix[0].length; c++) {
      if (matrix[0][c] == 0) {
        for (int r = 1; r < matrix.length; r++) {
          matrix[r][c] = 0;
        }
      }
    }
    if (firstRowHasZero) {
      for (int i = 0; i < matrix[0].length; i++) {
        matrix[0][i] = 0;
      }
    }
    if (firstColumnHasZero) {
      for (int i = 0; i < matrix.length; i++) {
        matrix[i][0] = 0;
      }
    }
    return matrix;
  }

}
