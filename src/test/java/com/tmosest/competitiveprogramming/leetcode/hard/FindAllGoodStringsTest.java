package com.tmosest.competitiveprogramming.leetcode.hard;

import com.tmosest.competitiveprogramming.utils.number.NumberUtil;
import com.tmosest.competitiveprogramming.utils.string.StringUtil;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("string")
@Tag("wc182")
@Tag("dynamic")
@DisplayName("LeetCode: 1397. Find All Good Strings")
class FindAllGoodStringsTest {

  private FindAllGoodStrings findAllGoodStrings = new FindAllGoodStrings();

  @Test
  void testCase0() {
    Assertions.assertEquals(51,
        findAllGoodStrings.findGoodStrings(
            2,
            "aa",
            "da",
            "b"
        ));
  }

  @Test
  void testCase1() {
    Assertions.assertEquals(0,
        findAllGoodStrings.findGoodStrings(
            8,
            "leetcode",
            "leetgoes",
            "leet"
        ));
  }

  @Test
  void testCase2() {
    Assertions.assertEquals(2,
        findAllGoodStrings.findGoodStrings(
            2,
            "gx",
            "gz",
            "x"
        ));
  }

  @Test
  void testCase3() {
    for (int i = 1; i <= 500; i++) {
      Assertions.assertNotEquals(
          NumberUtil.pow(26, i, FindAllGoodStrings.MOD),
          findAllGoodStrings.findGoodStrings(
              i,
              StringUtil.createRepeatString("a", i),
              StringUtil.createRepeatString("z", i),
              ""
          ), "failed @ " + i);
    }
  }
}
