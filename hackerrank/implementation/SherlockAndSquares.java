package hackerrank.implementation;

import java.util.Scanner;

public class SherlockAndSquares {
  
  public static long countSquaresInclusive(long a, long b) {
    long count = 0;
    
    long start = (long) Math.sqrt((double) a);
    long end = (long) Math.sqrt((double) b);
    
    long number = start;
    
    while(number <= end) {
      long numSquared = number * number;
      if(a <= numSquared && numSquared <= b) count++;
      number++;
    }
    
    return count;
  }
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int tests = in.nextInt();
    
    for(int i = 0; i< tests; i++) {
      System.out.println(countSquaresInclusive(in.nextLong(), in.nextLong()));
    }
    
    in.close();
  }
  
}
