package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.utils.ComplexNumber;

public class ComplexNumberMultiplication {
  /**
   * Perform complex multiplication.
   * @param complexOne First complex number.
   * @param complexTwo Second complex number.
   * @return The product of multiplication.
   */
  public String complexNumberMultiply(String complexOne, String complexTwo) {
    ComplexNumber one = new ComplexNumber(complexOne);
    ComplexNumber two = new ComplexNumber(complexTwo);
    return one.multiply(two).toString();
  }
}
