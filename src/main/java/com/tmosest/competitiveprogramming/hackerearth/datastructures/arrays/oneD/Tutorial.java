package com.tmosest.competitiveprogramming.hackerearth.datastructures.arrays.oneD;

import java.util.Arrays;
import java.util.Scanner;

public class Tutorial {
  
  public static boolean debugMode = false;
  
  public static int[] reverse(int[] arr) {
    int[] reverse = new int[arr.length];
    for(int i = 0; i < arr.length; i++) {
      reverse[i] = arr[arr.length - i - 1];
    }
    return reverse;
  }
  
  public static int[] solve() {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int[] arr = new int[size];
    for(int i = 0; i < size; i++) {
      arr[i] = in.nextInt();
    }
    in.close();
    return reverse(arr);
  }
  
  public static void main(String[] args) {
    Arrays.stream(solve()).forEach(System.out::println);
  }
  
}
