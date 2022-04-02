package com.tmosest.competitiveprogramming.codejam.jame2019.jam2022;

import com.tmosest.competitiveprogramming.codejam.jam2022.DiceGame;
import com.tmosest.competitiveprogramming.codejam.jam2022.ThreeDPrinting;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

// https://codingcompetitions.withgoogle.com/codejam/round/0000000000876ff1/0000000000a46471
@Tag("googleCodeJam2022")
@Tag("qualifier")
@DisplayName("Google Code Jam 2022: d1000000 (9pts, 11pts) ")
public class DiceGameTest {

  @Test
  void test_sample_works() throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(
                "4\n"
                + "4\n"
                + "6 10 12 8\n"
                + "6\n"
                + "5 4 5 4 4 4\n"
                + "10\n"
                + "10 10 7 6 7 4 4 5 7 4\n"
                + "1\n"
                + "10\n"
    );
    DiceGame.main(null);
  }
}
