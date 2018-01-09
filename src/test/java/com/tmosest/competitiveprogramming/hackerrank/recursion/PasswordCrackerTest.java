package com.tmosest.competitiveprogramming.hackerrank.recursion;

import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Hackerrank Recursion: Password Cracker")
public class PasswordCrackerTest {

  private static void test(String input, String[] output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    PasswordCracker.debugMode = debugMode;
    Assertions.assertArrayEquals(output, PasswordCracker.solve());
  }
/*
  @DisplayName("Test Case 0")
  @Test
  void testCase0() throws UnsupportedEncodingException {
    String input = "3\n"
        + "6\n"
        + "because can do must we what\n"
        + "wedowhatwemustbecausewecan\n"
        + "2\n"
        + "hello planet\n"
        + "helloworld\n"
        + "3\n"
        + "ab abcd cd\n"
        + "abcd";
    String[] output = {"we do what we must because we can", "WRONG PASSWORD", "abcd"};
    test(input, output, false);
  }

  @DisplayName("Test Case 1")
  @Test
  void testCase1() throws UnsupportedEncodingException {
    String input = "3\n"
        + "4\n"
        + "ozkxyhkcst xvglh hpdnb zfzahm\n"
        + "zfzahm\n"
        + "4\n"
        + "gurwgrb maqz holpkhqx aowypvopu\n"
        + "gurwgrb\n"
        + "10\n"
        + "a aa aaa aaaa aaaaa aaaaaa aaaaaaa aaaaaaaa aaaaaaaaa aaaaaaaaaa\n"
        + "aaaaaaaaaab";
    String[] output = {"zfzahm", "gurwgrb", "WRONG PASSWORD"};
    test(input, output, false);
  }
*/
  @DisplayName("Test Case 2")
  @Test
  void testCase2() throws UnsupportedEncodingException {
    String input = "4\n"
        + "6\n"
        + "zsnpgbqh bktrpgdwbu qhuhzxfh mxrgmga omgtgnqomb dffttrwlfh\n"
        + "nktrsgtwbuzsbptzahomgtgnaoma\n"
        + "6\n"
        + "xkof medbc mhyewjzsdg vkuzym tbeqv xtbyhn\n"
        + "xtbyhnmedbcmhyewjzsdgxtbyhn\n"
        + "6\n"
        + "alutwfal kkhbqlrxnm qyyx lwdgpchwic rdtgzvw sduh\n"
        + "sduhkkhbqlrxnmsduhsduhqyyx\n"
        + "10\n"
        + "a aa aaa aaaa aaaaa aaaaaa aaaaaaa aaaaaaaa aaaaaaaaa aaaaaaaaaa\n"
        + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
    String[] output = {"WRONG PASSWORD",
        "xtbyhn medbc mhyewjzsdg xtbyhn",
        "sduh kkhbqlrxnm sduh sduh qyyx",
        "WRONG PASSWORD"};
    test(input, output, true);
  }
}
