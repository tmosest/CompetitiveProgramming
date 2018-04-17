package com.tmosest.competitiveprogramming.hackerearth.algorithms.search.binarysearch;

import java.io.IOException;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;

@DisplayName("Hackerrank Binary Search: The Soap Mystery")
class TheSoapMysteryTest {

  public static void test(String input, int[] output, boolean debugMode) throws IOException {
    HackerrankUtil.setSystemIn(input);
    TheSoapMystery.debugMode = debugMode;
    Assert.assertArrayEquals(output, TheSoapMystery.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws IOException {
    String input = "5\n" + "1 4 10 5 6\n" + "4\n" + "2\n" + "3\n" + "5\n" + "11";
    int[] output = {1, 1, 2, 5};
    test(input, output, false);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() throws IOException {
    String input = "100\n"
        + "12939 16483 21956 856 29218 15649 23617 27642 27952 12635 17063 5578 26106 15505 14215 3559 10928 21380 32427 25278 17056 2203 10226 20360 31658 13190 10331 16659 27636 15393 2399 6086 15327 3227 8836 19168 19513 28375 4399 20736 3252 22802 25273 29162 5782 28103 9414 25992 24499 13007 20434 25647 6552 17357 16397 3108 4362 969 12393 16479 8623 4635 27633 25742 4618 1675 10588 6749 27565 14518 17634 25589 9129 5812 19534 20418 10058 20215 4437 4474 8449 20854 13862 11355 2466 27659 26690 4788 22991 1562 15758 24230 28596 16244 26534 2092 31990 30331 12661 15449\n"
        + "100\n" + "4325\n" + "31110\n" + "31491\n" + "14817\n" + "4857\n" + "26503\n" + "10125\n"
        + "22235\n" + "16764\n" + "1003\n" + "12763\n" + "5061\n" + "2180\n" + "449\n" + "23246\n"
        + "24521\n" + "17700\n" + "2591\n" + "9785\n" + "29246\n" + "18659\n" + "449\n" + "6641\n"
        + "23922\n" + "12653\n" + "20980\n" + "29480\n" + "16039\n" + "26761\n" + "14514\n"
        + "17910\n" + "12123\n" + "24651\n" + "25615\n" + "15161\n" + "23501\n" + "24459\n"
        + "23764\n" + "24735\n" + "25276\n" + "29334\n" + "1129\n" + "16129\n" + "25202\n"
        + "21538\n" + "10744\n" + "10995\n" + "22273\n" + "25224\n" + "31439\n" + "921\n"
        + "11725\n" + "29997\n" + "20998\n" + "21436\n" + "12874\n" + "9793\n" + "11106\n"
        + "2332\n" + "14343\n" + "25773\n" + "15738\n" + "13832\n" + "9708\n" + "25158\n"
        + "32536\n" + "4397\n" + "18112\n" + "12871\n" + "7138\n" + "10156\n" + "749\n" + "11262\n"
        + "7226\n" + "30063\n" + "26504\n" + "26053\n" + "17506\n" + "22460\n" + "7820\n"
        + "23604\n" + "28388\n" + "3594\n" + "15462\n" + "6549\n" + "26161\n" + "15636\n" + "1719\n"
        + "29080\n" + "392\n" + "10285\n" + "6229\n" + "9545\n" + "2329\n" + "5331\n" + "1683\n"
        + "830\n" + "9579\n" + "3206\n" + "27586";
    int[] output = {12, 97, 97, 45, 19, 83, 31, 71, 56, 2, 39, 19, 5, 0, 73, 76, 60, 8, 30, 96, 60,
        0, 24, 74, 38, 69, 96, 51, 85, 44, 60, 36, 76, 79, 45, 73, 75, 74, 76, 77, 96, 2, 51, 76,
        70, 34, 35, 71, 76, 97, 1, 36, 96, 69, 70, 39, 30, 35, 6, 44, 81, 50, 42, 30, 76, 100, 13,
        60, 39, 25, 31, 0, 35, 25, 96, 83, 82, 59, 71, 25, 73, 93, 12, 48, 23, 83, 49, 4, 94, 0, 32,
        23, 30, 6, 19, 4, 0, 30, 9, 86};
    test(input, output, false);
  }
}
