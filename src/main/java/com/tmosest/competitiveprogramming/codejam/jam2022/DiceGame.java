package com.tmosest.competitiveprogramming.codejam.jam2022;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class DiceGame {

  /**
   * Function to run the program.
   * @param args The args for the program.
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int tests = in.nextInt();
    for (int t = 1; t <= tests; ++t) {
      try {
        System.out.print("Case #" + t + ": ");
        int diceCount = in.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (; diceCount > 0; diceCount--) {
          queue.add(in.nextInt());
        }

        int num = 0;
        while (!queue.isEmpty()) {
          int val = queue.poll();
          if (val > num) {
            num++;
          }
        }
        System.out.print(num);
        System.out.println();

      } catch (Exception e) {
        System.out.println("Case #" + t + ": Error!!!");
      }
    }
  }
}
