package hackerrank.implementation;

import java.util.Scanner;

public class AppendAndDelete {

  public static boolean canAppendAndDelete(String one, String two, int moves) {
    // We have more operations than we need to delete and rewrite the string
    if (two.length() + one.length() <= moves)
      return true;

    int countSame = -1;
    while(++countSame < Math.min(one.length(), two.length()) - 1) {
      if (one.charAt(countSame) != two.charAt(countSame)) {
        break;
      }
    }
    
    if (countSame == one.length() && one.length() == two.length()) {
      // if k is odd, there will always be 1 operation left over
      // else, you can delete and re-append last character to use up k operations
      return ((moves & 1) == 1) ? false : true;
    }
    
    
    int differenceOne = one.length() - countSame;
    int differenceTwo = two.length() - countSame;
   
    moves -= differenceOne;
    moves -= differenceTwo;

    // If k < 0 or there is an odd number of operations left over, false
    // else we need exactly k operations or the number of extra ops is even, true
    return (moves < 0 || (moves & 1) == 1) ? false : true;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    String t = in.next();
    int k = in.nextInt();
    in.close();
    if (canAppendAndDelete(s, t, k))
      System.out.println("Yes");
    else
      System.out.println("No");
  }

}
