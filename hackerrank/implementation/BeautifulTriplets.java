package hackerrank.implementation;

import java.util.Scanner;

public class BeautifulTriplets {

  public static boolean debugMode = false;

  public static int countTripletesFast(int[] array, int distance) {
    int n = array.length;
    int max = array[n - 1];
    if(debugMode)
      System.out.println("Min: " + array[0] + "Max: " + max);
    boolean[] values = new boolean[max + 2];
    for (int i = 0; i < n; i++) {
      values[array[i]] = true;
    }
    int count = 0;
    for (int i = 0; i < n; i++) {
      int value = array[i];
      int d = value + distance;
      int d2 = value + 2 * distance;
      if(debugMode) {
        System.out.println("value: " + value);
        System.out.println("d : " + d);
        System.out.println("d2: " + d2);
      }
      if (d <= max && d2 <= max && values[d] && values[d2]) {
        ++count;
        if(debugMode) {
          System.out.println("count: " + count);
        }
      }
    }
    return count;
  }

  public static int solve() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int d = in.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < array.length; i++) {
      array[i] = in.nextInt();
    }
    in.close();
    int count = countTripletesFast(array, d);
    System.out.println(count);
    return count;
  }

  public static void main(String[] args) {
    solve();
  }

}
