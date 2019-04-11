package com.tmosest.competitiveprogramming.codejam.jame2019.qualification;

import com.tmosest.competitiveprogramming.codejam.jam2019.ForgoneSolutions;
import com.tmosest.competitiveprogramming.codejam.jam2019.ForgoneSolutions.Pair;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("googleCodeJam2019")
@Tag("qualifier")
@Tag("number")
@DisplayName("LeetCode: 415. Add Strings")
public class ForgoneSolutionsTest {

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Pair actual = ForgoneSolutions.getCheckWithOutFours(4);
    Assertions.assertNotEquals(4, actual.one);
    Assertions.assertNotEquals(4, actual.two);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Pair actual = ForgoneSolutions.getCheckWithOutFours(4444);
    Assertions.assertNotEquals(4, actual.one);
    Assertions.assertNotEquals(4, actual.two);
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(
        "3\n"
        + "4\n"
        + "940\n"
        + "4444"
    );
    ForgoneSolutions.main(null);
  }
}
