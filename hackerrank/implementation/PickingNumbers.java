package hackerrank.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class PickingNumbers {

  private static final boolean debugMode = false;

  public static int countLargestSubsetWithDiffOfOne(int[] ar) {
    int maxCount = 0;

    Arrays.sort(ar);

    int startIndex = 0;
    int start = ar[startIndex];
    int count = 1;

    for (int i = 1; i < ar.length; i++) {
      if (debugMode) {
        System.out.println("i: " + i + " ar[i]: " + ar[i]);
        System.out.println(ar[i] + " - " + start + " = " + (ar[i] - start));
      }
      if (ar[i] - start <= 1) {
        ++count;
        maxCount = (count > maxCount) ? count : maxCount;
        if (debugMode) {
          System.out.println("MaxCount: " + maxCount);
        }
      } else {
        ++startIndex;
        i = startIndex;
        if (startIndex < ar.length)
          start = ar[startIndex];
        count = 1;
      }
    }

    return maxCount;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int[] inputs = new int[n];

    for (int i = 0; i < n; i++) {
      inputs[i] = in.nextInt();
    }

    in.close();
    System.out.println(countLargestSubsetWithDiffOfOne(inputs));
  }

}
