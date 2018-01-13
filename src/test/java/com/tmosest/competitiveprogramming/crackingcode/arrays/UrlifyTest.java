package com.tmosest.competitiveprogramming.crackingcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Cracking The Code Interview: Arrays: 1.3 URLify")
public class UrlifyTest {

  @Test
  void testUrlify() {
    String string = "Mr John Smith    ";
    Assertions.assertEquals("Mr%20John%20Smith", Urlify.urlify(string.toCharArray(), 13));
  }

}
