package com.tmosest.MvnCompetitiveProgramming.hackerrank.warmup;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import com.tmosest.MvnCompetitiveProgramming.hackerrank.HackerrankUtil;

public class SolveMeFirstTest {

  String data;
  
  @Test
  public void testCase0() throws UnsupportedEncodingException {
    data = "2\n3";
    HackerrankUtil.setSystemIn(data);
    Assertions.assertEquals(5, SolveMeFirst.solve());
  }

}
