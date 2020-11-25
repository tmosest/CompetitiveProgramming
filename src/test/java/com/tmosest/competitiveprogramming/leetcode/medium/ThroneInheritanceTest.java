package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("design")
@Tag("wc208")
@DisplayName("LeetCode: 1600. Throne Inheritance")
class ThroneInheritanceTest {

  @Test
  void test1() {
    ThroneInheritance t= new ThroneInheritance("king"); // order: king
    t.birth("king", "andy"); // order: king > andy
    t.birth("king", "bob"); // order: king > andy > bob
    t.birth("king", "catherine"); // order: king > andy > bob > catherine
    t.birth("andy", "matthew"); // order: king > andy > matthew > bob > catherine
    t.birth("bob", "alex"); // order: king > andy > matthew > bob > alex > catherine
    t.birth("bob", "asha"); // order: king > andy > matthew > bob > alex > asha > catherine
    t.getInheritanceOrder(); // return ["king", "andy", "matthew", "bob", "alex", "asha", "catherine"]
    t.death("bob"); // order: king > andy > matthew > bob > alex > asha > catherine
    Assertions.assertArrayEquals(new String[] {"king", "andy", "matthew", "alex", "asha", "catherine"},
      t.getInheritanceOrder().toArray()); // return ["king", "andy", "matthew", "alex", "asha", "catherine"]
  }
}
