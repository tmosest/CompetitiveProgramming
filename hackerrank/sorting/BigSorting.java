package hackerrank.sorting;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigSorting {

  public static String[] solve() {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    in.nextLine();
    String[] array = new String[size];
    for (int i = 0; i < size; i++) {
      array[i] = in.nextLine();
    }
    in.close();
    Arrays.sort(array, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        int n = o1.length();
        int m = o2.length();
        if (n == m)
          return o1.compareTo(o2);
        return (n < m) ? -1 : 1;
      }
    });
    for (int i = 0; i < size; i++)
      System.out.println(array[i]);
    return array;
  }

  public static void main(String[] args) {
    solve();
  }
}
