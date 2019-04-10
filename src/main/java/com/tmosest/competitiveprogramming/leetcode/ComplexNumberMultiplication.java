package com.tmosest.competitiveprogramming.leetcode;

public class ComplexNumberMultiplication {

  private static class ComplexNumber {
    int one;
    int two;

    private ComplexNumber(int one, int two) {
      this.one = one;
      this.two = two;
    }

    private ComplexNumber(String string) {
      String[] vales = string.split("\\+");
      this.one = Integer.valueOf(vales[0]);
      this.two = Integer.valueOf(vales[1].replace("i", ""));
    }

    private ComplexNumber multiply(ComplexNumber other) {
      int one = this.one * other.one - this.two * other.two;
      int two = this.two * other.one + other.two * this.one;
      return new ComplexNumber(one, two);
    }

    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(one);
      stringBuilder.append("+");
      stringBuilder.append(two);
      stringBuilder.append("i");
      return stringBuilder.toString();
    }
  }

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
