package com.tmosest.CompetitiveProgramming.hackerrank.greedy;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.CompetitiveProgramming.hackerrank.HackerrankUtil;

@DisplayName("Hackerrank Greedy: Marc's Cakewalk")
class MarcsCakewalkTest {

  String data;

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    data = "3\n1 3 2";
    HackerrankUtil.setSystemIn(data);
    Assertions.assertEquals(11, MarcsCakewalk.solve());
  }

}
