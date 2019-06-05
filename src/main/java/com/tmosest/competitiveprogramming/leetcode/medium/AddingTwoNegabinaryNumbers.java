package com.tmosest.competitiveprogramming.leetcode.medium;

class AddingTwoNegabinaryNumbers {

  /**
   * Add two negative 2 binary numbers.
   *
   * @param one The first number.
   * @param two The second number.
   * @return The sum of them in base -2.
   */
  public int[] addNegabinary(int[] one, int[] two) {
    int oneNum = fromBaseNegTwo(one);
    int twoNum = fromBaseNegTwo(two);
    int sum = oneNum + twoNum;
    String base2 = new ConvertToBaseNegativeTwo().baseNeg2(sum);
    int[] result = new int[base2.length()];
    for (int i = 0; i < result.length; i++) {
      result[i] = Integer.parseInt(base2.substring(i, i + 1));
    }
    return result;
  }

  private int fromBaseNegTwo(int[] num) {
    int result = 0;
    int pow = 1;
    for (int i = num.length - 1; i > -1; i--) {
      result += pow * num[i];
      pow *= -2;
    }
    return result;
  }
}
