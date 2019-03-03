package com.tmosest.competitiveprogramming.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("matrix")
@DisplayName("LeetCode: 812. Largest Triangle Area")
public class BinaryWatchTest {

  BinaryWatch binaryWatch = new BinaryWatch();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] times = {
        "1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"
    };
    List<String> expected = Arrays.asList(times);
    List<String> actual = binaryWatch.readBinaryWatch(1);
    Collections.sort(expected);
    Collections.sort(actual);
    Assertions.assertEquals(expected.size(), actual.size());
    for (int i = 0; i < expected.size(); i++) {
      Assertions.assertEquals(expected.get(i), actual.get(i));
    }
  }
}
