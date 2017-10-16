package hackerrank.strings;

import java.util.Scanner;

public class HackerRankInAString {

  private static final String word = "hackerrank";

  private static boolean containsHackerrank(String s) {
    boolean result = false;
    int look_index = 0;
    char lookingFor = word.charAt(look_index);
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == lookingFor) {
        ++look_index;
        if (look_index == word.length()) {
          result = true;
          break;
        }
        lookingFor = word.charAt(look_index);
      }
    }
    return result;
  }

  private static void printAnswers(String[] ans) {
    for (int i = 0; i < ans.length; i++)
      System.out.println(ans[i]);
  }

  public static String[] solve() {
    Scanner in = new Scanner(System.in);
    int tests = in.nextInt();
    String[] answers = new String[tests];
    in.nextLine();
    for (int i = 0; i < tests; i++) {
      answers[i] = (containsHackerrank(in.nextLine())) ? "YES" : "NO";
    }
    in.close();
    printAnswers(answers);
    return answers;
  }

  public static void main(String[] args) {
    solve();
  }
}
