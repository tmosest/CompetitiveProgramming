package implementation;

import java.util.Scanner;

public class CircularArrayRotation {

  public static int[] rotatedArray(int[] ar, int k) {
    int[] rotated = new int[ar.length];
    for (int i = 0; i < ar.length; i++) {
       rotated[(i + k) % ar.length] = ar[i];
    }
    return rotated;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int q = in.nextInt();
    int[] a = new int[n];
    for (int a_i = 0; a_i < n; a_i++) {
      a[a_i] = in.nextInt();
    }
    a = rotatedArray(a, k);
    for (int a0 = 0; a0 < q; a0++) {
      int m = in.nextInt();
      System.out.println(a[m]);
    }
    in.close();
  }

}
