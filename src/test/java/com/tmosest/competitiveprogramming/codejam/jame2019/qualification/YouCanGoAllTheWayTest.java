package com.tmosest.competitiveprogramming.codejam.jame2019.qualification;

import com.tmosest.competitiveprogramming.codejam.jam2019.YouCanGoAllTheWay;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("googleCodeJam2019")
@Tag("qualifier")
@Tag("string")
@DisplayName("LeetCode: 415. Add Strings")
public class YouCanGoAllTheWayTest {

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("ES", YouCanGoAllTheWay.getUniquePath("SE", 2));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertNotEquals("EESSSESE", YouCanGoAllTheWay.getUniquePath("EESSSESE", 5));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn("2\n"
        + "2\n"
        + "SE\n"
        + "5\n"
        + "EESSSESE");
    YouCanGoAllTheWay.main(null);
  }
}
