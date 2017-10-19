package hackerrank.sorting;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class BigSorting {
  
  public static BigInteger[] solve() {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    in.nextLine();
    BigInteger[] array = new BigInteger[size];
    for(int i = 0; i < size; i++) {
      array[i] = new BigInteger(in.nextLine());
    }
    in.close();
    Arrays.sort(array);
    for(int i = 0; i < size; i++) 
      System.out.println(array[i]);
    return array;
  }

  public static void main(String[] args) {
    solve();
  }
}
