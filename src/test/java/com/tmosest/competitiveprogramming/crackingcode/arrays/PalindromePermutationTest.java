package com.tmosest.competitiveprogramming.crackingcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromePermutationTest {

  @Test
  void trueForNonPalindromePermutations() {
    Assertions.assertEquals(true, PalindromePermutation.isPalindromePermutation("Tact Coa"));
    Assertions.assertEquals(true, PalindromePermutation.isPalindromePermutation("tactcoapapa"));
  }

  @Test
  void falseForNonPalindromePermutations() {
    Assertions.assertEquals(false, PalindromePermutation.isPalindromePermutation("Tac Coa"));
    Assertions.assertEquals(false, PalindromePermutation.isPalindromePermutation("TacaCoa"));
  }

  @Test
  void noSpecialCharacters() {
    Assertions.assertEquals(false, PalindromePermutation.isPalindromePermutation("Tac?Coa"));
    Assertions.assertEquals(true, PalindromePermutation.isPalindromePermutation("Taco?Coat"));
  }

}
