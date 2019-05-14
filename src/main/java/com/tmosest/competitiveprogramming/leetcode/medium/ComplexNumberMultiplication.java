package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.utils.ComplexNumber;

class ComplexNumberMultiplication {
  /* Write code here. */

  /**
   * Perform complex multiplication.
   *
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
