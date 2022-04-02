package com.tmosest.competitiveprogramming.codejam.jam2022;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PunchedCards {

  /*
      ..+-+-+-+
      ..|.|.|.|
      +-+-+-+-+
      |.|.|.|.|
      +-+-+-+-+
      |.|.|.|.|
      +-+-+-+-+
   */

  private static class PunchCard {
    private int cols;
    private int rows;

    private PunchCard(int rows, int cols) {
      this.cols = cols;
      this.rows = rows;
    }

    private void printASCIIArt() {
      // print 2 * rows + 1 and 2 * cols + 1 cols;
      for (int r = 0; r < 2 * rows + 1; r++) {
        for (int c = 0; c < 2 * cols + 1; c++) {
          if (r <= 1 && c <= 1) {
            System.out.print('.');
          }
          else if (r % 2 == 1 && c % 2 == 1) {
            System.out.print('.');
          }
          else if (r % 2 == 0 && c % 2 == 0) {
            System.out.print('+');
          }
          else if (r % 2 == 0 && c % 2 == 1) {
            System.out.print('-');
          }
          else if (r % 2 == 1 && c % 2 == 0) {
            System.out.print('|');
          }
        }
        System.out.println();
      }
    }
  }

  /**
   * Function to run the program.
   * @param args The args for the program.
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int tests = in.nextInt();
    for (int t = 1; t <= tests; ++t) {
      int rows = in.nextInt();
      int cols = in.nextInt();
      PunchCard punchCard = new PunchCard(rows, cols);
      try {
        System.out.println("Case #" + t + ": ");
        punchCard.printASCIIArt();
      } catch (Exception e) {
        System.out.println("Case #" + t + ": ");
      }
    }
  }
}
