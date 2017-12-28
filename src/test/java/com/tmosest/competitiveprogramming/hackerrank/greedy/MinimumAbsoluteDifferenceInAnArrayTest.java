package com.tmosest.competitiveprogramming.hackerrank.greedy;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;

@DisplayName("Hackerrank Greedy: Minimum Absolute Difference in an Array")
class MinimumAbsoluteDifferenceInAnArrayTest {

  String data;
  
  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    data = "3\n3 -7 0";
    HackerrankUtil.setSystemIn(data);
    Assertions.assertEquals(3, MinimumAbsoluteDifferenceInAnArray.solve());
  }

}
