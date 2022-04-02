package com.tmosest.competitiveprogramming.codejam.jame2019.jam2022;

import com.tmosest.competitiveprogramming.codejam.jam2022.ThreeDPrinting;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

// https://codingcompetitions.withgoogle.com/codejam/round/0000000000876ff1/0000000000a4672b
@Tag("googleCodeJam2022")
@Tag("qualifier")
@DisplayName("Google Code Jam 2022: 3D Printing (13pts) ")
public class ThreeDPrintingTest {

  @Test
  void test_sample_works() throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(
            "3\n"
            + "300000 200000 300000 500000\n"
            + "300000 200000 500000 300000\n"
            + "300000 500000 300000 200000\n"
            + "1000000 1000000 0 0\n"
            + "0 1000000 1000000 1000000\n"
            + "999999 999999 999999 999999\n"
            + "768763 148041 178147 984173\n"
            + "699508 515362 534729 714381\n"
            + "949704 625054 946212 951187\n"
    );
    ThreeDPrinting.main(null);
  }
}
