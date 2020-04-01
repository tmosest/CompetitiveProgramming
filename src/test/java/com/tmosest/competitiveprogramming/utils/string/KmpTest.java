package com.tmosest.competitiveprogramming.utils.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("String")
@DisplayName("KMP Algorithm for Pattern Searching")
class KmpTest {

  @Test
  @DisplayName("ABCDE LPS is [0, 0, 0, 0]")
  void lpsTestCase0() {
    Assertions.assertArrayEquals(
        new int[]{0, 0, 0, 0, 0},
        Kmp.constructLps("ABCDE")
    );
  }

  @Test
  @DisplayName("AAAA LPS is [0, 1, 2, 3]")
  void lpsTestCase1() {
    Assertions.assertArrayEquals(
        new int[]{0, 1, 2, 3},
        Kmp.constructLps("AAAA")
    );
  }

  @Test
  @DisplayName("AABAACAABAA LPS is [0, 1, 0, 1, 2, 0, 1, 2, 3, 4, 5]")
  void lpsTestCase2() {
    Assertions.assertArrayEquals(
        new int[]{0, 1, 0, 1, 2, 0, 1, 2, 3, 4, 5},
        Kmp.constructLps("AABAACAABAA")
    );
  }

  @Test
  @DisplayName("AAACAAAAAC LPS is [0, 1, 2, 0, 1, 2, 3, 3, 3, 4]")
  void lpsTestCase3() {
    Assertions.assertArrayEquals(
        new int[]{0, 1, 2, 0, 1, 2, 3, 3, 3, 4},
        Kmp.constructLps("AAACAAAAAC")
    );
  }

  @Test
  @DisplayName("AAABAAA LPS is [0, 1, 2, 0, 1, 2, 3]")
  void lpsTestCase4() {
    Assertions.assertArrayEquals(
        new int[]{0, 1, 2, 0, 1, 2, 3},
        Kmp.constructLps("AAABAAA")
    );
  }
}
