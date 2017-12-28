package com.tmosest.competitiveprogramming.hackerrank.warmup;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;

@DisplayName("Hackerrank Warmup: Solved Me First")
public class SolveMeFirstTest {

  String data;

  @Test
  @DisplayName("Test Case: 0")
  public void testCase0() throws UnsupportedEncodingException {
    data = "2\n3";
    HackerrankUtil.setSystemIn(data);
    Assertions.assertEquals(5, SolveMeFirst.solve());
  }

}
