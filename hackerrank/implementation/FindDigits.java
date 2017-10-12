package hackerrank.implementation;

import java.util.Scanner;

public class FindDigits {

  public static int countDivisibleDigits(String number) {
    int count = 0;
    int intNumber = Integer.parseInt(number);
    for(int i = 0; i < number.length(); i++) {
      int digit = Character.getNumericValue(number.charAt(i));
      if(digit != 0 && intNumber % digit == 0) ++count;
    }
    return count;
  }
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int a0 = 0; a0 < t; a0++) {
      int n = in.nextInt();
      System.out.println(countDivisibleDigits(String.valueOf(n)));
    }
    in.close();
  }

}
