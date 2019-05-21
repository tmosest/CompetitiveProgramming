package com.tmosest.competitiveprogramming.codejam.jame2019.qualification;

import com.tmosest.competitiveprogramming.codejam.jam2019.Cryptopangrams;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import com.tmosest.competitiveprogramming.utils.number.PrimeUtil;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("googleCodeJam2019")
@Tag("qualifier")
@Tag("string")
@DisplayName("LeetCode: 415. Add Strings")
public class CryptopangramsTest {

  private long[] encodeMessage(String message) {
    List<Integer> primes = PrimeUtil.findPrimes(103);
    long[] result = new long[message.length() - 1];
    char[] mess = message.toCharArray();
    for (int i = 0; i < message.length() - 1; i++) {
      int index1 = primes.get(mess[i] - 'A' + 1);
      int index2 = primes.get(mess[i + 1] - 'A' + 1);
      result[i] = index1 * index2;
    }
    return result;
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    long[] input = {
      217 ,1891 ,4819 ,2291 ,2987 ,3811 ,1739 ,2491 ,4717 ,445 ,65 ,1079 ,8383 ,5353 ,901 ,187 ,649 ,1003 ,697 ,3239 ,7663 ,291 ,123 ,779 ,1007 ,3551 ,1943 ,2117 ,1679 ,989 ,3053
    };
    Assertions.assertEquals("CJQUIZKNOWBEVYOFDPFLUXALGORITHMS", Cryptopangrams.getMessage(103, input));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn("\t\n"
        + "2\n"
        + "103 31\n"
        + "217 1891 4819 2291 2987 3811 1739 2491 4717 445 65 1079 8383 5353 901 187 649 1003 697 3239 7663 291 123 779 1007 3551 1943 2117 1679 989 3053\n"
        + "10000 25\n"
        + "3292937 175597 18779 50429 375469 1651121 2102 3722 2376497 611683 489059 2328901 3150061 829981 421301 76409 38477 291931 730241 959821 1664197 3057407 4267589 4729181 5335543\n");
    Cryptopangrams.main(null);
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    long[] input = {
        217 ,1891 ,4819 ,2291 ,2987 ,3811 ,1739 ,2491 ,4717 ,445 ,65 ,1079 ,8383 ,5353 ,901 ,187 ,649 ,1003 ,697 ,3239 ,7663 ,291 ,123 ,779 ,1007 ,3551 ,1943 ,2117 ,1679 ,989 ,3053
    };
    Assertions.assertArrayEquals(input, encodeMessage("CJQUIZKNOWBEVYOFDPFLUXALGORITHMS"));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    Assertions.assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZA",
        Cryptopangrams.getMessage(103, encodeMessage("ABCDEFGHIJKLMNOPQRSTUVWXYZA")));
  }
}
