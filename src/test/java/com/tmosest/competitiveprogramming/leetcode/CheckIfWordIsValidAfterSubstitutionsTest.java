package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@DisplayName("LeetCode: 1003. Check If Word Is Valid After Substitutions")
class CheckIfWordIsValidAfterSubstitutionsTest {

  private CheckIfWordIsValidAfterSubstitutions checkIfWordIsValidAfterSubstitutions = new CheckIfWordIsValidAfterSubstitutions();

  @Test
  @DisplayName("abcabcababcc is a valid")
  void testCase0() {
    Assertions.assertTrue(checkIfWordIsValidAfterSubstitutions.isValid("abcabcababcc"));
  }

  @Test
  @DisplayName("cababc is not valid")
  void testCase1() {
    Assertions.assertFalse(checkIfWordIsValidAfterSubstitutions.isValid("cababc"));
  }
}
