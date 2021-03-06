package com.tmosest.competitiveprogramming.datastructures.implementations;

public class Operation {

  public static final char ADDITION_SYMBOL = '+';
  public static final char MULTIPLICATION_SYMBOL = '*';

  public static final Operation ADDITION = new Operation(ADDITION_SYMBOL);

  private char operation;

  public Operation(char operation) {
    this.operation = operation;
  }

  /**
   * Takes two longs and performs an operation on them.
   * @param one First long.
   * @param two Second ling.
   * @return The result of the operation on them.
   */
  public long operate(long one, long two) {
    switch (operation) {
      case MULTIPLICATION_SYMBOL:
        return one * two;
      case ADDITION_SYMBOL:
        return one + two;
      default:
        throw new IllegalArgumentException("Operation cannot be " + operation);
    }
  }

  @Override
  public String toString() {
    return "" + this.operation;
  }
}
