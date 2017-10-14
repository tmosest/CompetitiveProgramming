package hackerrank.implementation;

import java.util.Scanner;

public class MinimumDistances {

  public static boolean debugMode = false;

  public static int findMinimumDistance(int[] array) {
    int min = array.length;
    boolean foundPair = false;
    if (debugMode)
      System.out.println("start min: " + min);
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] == array[j]) {
          foundPair = true;
          int diff = j - i;
          if (diff < min) {
            min = diff;
            if (debugMode) {
              System.out.println("i: " + i + " j: " + j + " => " + array[i] + " " + array[j] + " min: " + min + "\n");
            }
          }
        }
      }
    }
    return (foundPair) ? min : -1;
  }

  public static int solve() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < n; i++)
      array[i] = in.nextInt();
    in.close();
    int count = findMinimumDistance(array);
    System.out.println(count);
    return count;
  }

  public static void main(String[] args) {
    solve();
  }

}
