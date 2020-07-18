package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("set")
@Tag("wc194")
@Tag("array")
@DisplayName("LeetCode: 1487. Making File Names Unique")
class MakingFileNamesUniqueTest {

  private MakingFileNamesUnique makingFileNamesUnique = new MakingFileNamesUnique();

  private void test(String[] input, String[] output) {
    String[] actual = makingFileNamesUnique.getFolderNames(input);
    Assertions.assertArrayEquals(output, actual);
  }

  @Test
  void testCase0() {
    test(new String[] {
        "pes","fifa","gta","pes(2019)"
    }, new String[] {
        "pes","fifa","gta","pes(2019)"
    });
  }

  @Test
  void testCase1() {
    test(new String[] {
        "gta","gta(1)","gta","avalon"
    }, new String[] {
        "gta","gta(1)","gta(2)","avalon"
    });
  }

  @Test
  void testCase2() {
    test(new String[] {
        "onepiece","onepiece(1)","onepiece(2)","onepiece(3)","onepiece"
    }, new String[] {
        "onepiece","onepiece(1)","onepiece(2)","onepiece(3)","onepiece(4)"
    });
  }

  @Test
  void testCase3() {
    test(new String[] {
        "wano","wano","wano","wano"
    }, new String[] {
        "wano","wano(1)","wano(2)","wano(3)"
    });
  }
}
