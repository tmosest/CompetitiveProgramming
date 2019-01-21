package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("design")
@Tag("string")
@DisplayName("LeetCode: 604. Design Compressed String Iterator")
public class StringIteratorTest {

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    StringIterator iterator = new StringIterator("L1e2t1C1o1d1e1");
    Assertions.assertEquals('L', iterator.next());
    Assertions.assertEquals('e', iterator.next());
    Assertions.assertEquals('e', iterator.next());
    Assertions.assertEquals('t', iterator.next());
    Assertions.assertEquals('C', iterator.next());
    Assertions.assertEquals('o', iterator.next());
    Assertions.assertEquals(true, iterator.hasNext());
    Assertions.assertEquals('d', iterator.next());
    Assertions.assertEquals('e', iterator.next());
    Assertions.assertEquals(false, iterator.hasNext());
    Assertions.assertEquals(' ', iterator.next());
  }
}
