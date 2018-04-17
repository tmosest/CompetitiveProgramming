package com.tmosest.competitiveprogramming.crackingcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Cracking The Code Interview: Arrays: 1.2 Check Permutation")
public class CheckPermutationTest {

  @Test
  void differentLengthsReturnFalse() {
    Assertions.assertEquals(false, CheckPermutation.arePermutations("abd", "a"));
  }

  @Test
  void permutatios() {
    String string = "#@!$$@!#Fsdadsa:{:>:[l;.;',;dsajuie219";
    String reveresed = new StringBuffer(string).reverse().toString();
    Assertions.assertEquals(true, CheckPermutation.arePermutations(string, reveresed));
  }

  @Test
  void notPermuatations() {
    Assertions.assertEquals(false, CheckPermutation
        .arePermutations("dsadas122321dsajioiosjda0912321,./[{}l;'l;';l,/ds",
            "#s^d}s122321dsajio$osjda0912321,./[{}l;'l;';l,/ds"));
  }
}
