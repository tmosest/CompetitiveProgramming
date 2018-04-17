package com.tmosest.competitiveprogramming.crackingcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Cracking The Code Interview: Arrays: 1.6 String Compression")
public class StringCompressionTest {

  @Test
  void compresses() {
    Assertions.assertEquals("a2b1c5a3", StringCompression.compresses("aabcccccaaa"));
  }

  @Test
  void wontCompressTooShort() {
    Assertions.assertEquals("a", StringCompression.compresses("a"));
  }
}
