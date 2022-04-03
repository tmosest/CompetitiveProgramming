package com.tmosest.competitiveprogramming.codejam.jame2019.jam2022;

import com.tmosest.competitiveprogramming.codejam.jam2022.ChainReactions;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

// https://codingcompetitions.withgoogle.com/codejam/round/0000000000876ff1/0000000000a45ef7
@Tag("googleCodeJam2022")
@Tag("qualifier")
@DisplayName("Google Code Jam 2022: Chain Reactions (10pts, 12pts, 5pts) ")
public class ChainReactionTest {

  @Test
  void test_sample_works() throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(
        "3\n"
            + "4\n"
            + "60 20 40 50\n"
            + "0 1 1 2\n"
            + "5\n"
            + "3 2 1 4 5\n"
            + "0 1 1 1 0\n"
            + "8\n"
            + "100 100 100 90 80 100 90 100\n"
            + "0 1 2 1 2 3 1 3\n"
    );
    ChainReactions.main(null);
  }
}
