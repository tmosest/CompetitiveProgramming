package com.tmosest.competitiveprogramming.hackerrank.warmup;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;

@DisplayName("Hackerrank Warmup: Simple Array Sum")
class SimpleArraySumTest {

  String data;

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    data = "6\n1 2 3 4 10 11";
    HackerrankUtil.setSystemIn(data);
    Assertions.assertEquals(31, SimpleArraySum.solve());
  }

}
