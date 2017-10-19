package hackerrank.strings;

import java.math.BigInteger;
import java.util.Scanner;

public class SeparateTheNumbers {

  public static boolean debugMode = false;
  
  // Fast digit count
  // https://stackoverflow.com/questions/18828377/biginteger-count-the-number-of-decimal-digits-in-a-scalable-method
  private static int getDigitCount(BigInteger number) {
    double factor = Math.log(2) / Math.log(10);
    int digitCount = (int) (factor * number.bitLength() + 1);
    if (BigInteger.TEN.pow(digitCount - 1).compareTo(number) > 0) {
      return digitCount - 1;
    }
    return digitCount;
  }

  private static String isIncreasingSequence(String number) {
    if(debugMode)
      System.out.println("number: " + number);
    String result = "-1";
    int index = 1;
    int length = 1;
    
    String next = number.substring(0, length);
    if(next.equals("0"))
      return result;
    String toCheck;
    int lengthToCheck = 1;
    while(index + lengthToCheck <= number.length()) {
      
      lengthToCheck = getDigitCount(new BigInteger(next).add(BigInteger.ONE));//String.valueOf(Integer.parseInt(next) + 1).length();
      if(debugMode) {
        System.out.println();
        System.out.println("index : " + index + " length: " + length);
        System.out.println("length to Check: " + lengthToCheck + " string length: " + number.length());
      }
      if(index + length > 0 && index < number.length() && index + lengthToCheck <= number.length())
        toCheck = number.substring(index, index + lengthToCheck);
      else
        break;
      if(debugMode) {
        System.out.println("next: " + next + " toCheck: " + toCheck);
      }
      //new BigInteger(toCheck).equals(new BigInteger(next).add(BigInteger.ONE));
      if(new BigInteger(toCheck).equals(new BigInteger(next).add(BigInteger.ONE))) {
        //if(Integer.parseInt(toCheck) == Integer.parseInt(next) + 1) {
        if(debugMode) {
          System.out.println("final check: " + (index + lengthToCheck) + " == " +  number.length());
          System.out.println();
        }
        if(index + lengthToCheck == number.length()) {
          result = number.substring(0, length);
          break;
        }
        index += toCheck.length();
        next = toCheck;
      } else {
       ++length;
       next = number.substring(0, 0 + length);
       index = length;
      }
    }

  return result;

  }

  public static String[][] solve() {
    Scanner in = new Scanner(System.in);
    int tests = in.nextInt();
    in.nextLine();
    String[][] answers = new String[tests][2];
    for (int i = 0; i < tests; i++) {
      String number = in.nextLine();
      String result = isIncreasingSequence(number);
      if (result.equals("-1"))
        System.out.println("NO");
      else
        System.out.println("YES " + result);
      answers[i][0] = (result.equals("-1")) ? "NO" : "YES";
      answers[i][1] = result;
    }
    in.close();
    return answers;
  }

  public static void main(String[] args) {
    solve();
  }
}
