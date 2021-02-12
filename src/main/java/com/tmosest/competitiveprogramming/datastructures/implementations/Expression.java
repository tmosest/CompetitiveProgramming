package com.tmosest.competitiveprogramming.datastructures.implementations;

import com.tmosest.competitiveprogramming.utils.string.StringUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Simple left-right expression solver.
 * Does operate on () first
 */
public class Expression {

  private String original;
  private Map<Integer, Expression> expressionMap;
  private long value;

  public Expression(String expression) {
    original = expression;
    expressionMap = new HashMap<>();
  }

  /**
   * Takes an expression and reduces it to a smaller one.
   * @return A smaller expression with potentially unknown operations.
   */
  public Expression reduce() {
    StringBuilder nextExpression = new StringBuilder();

    long tempValue = 0;
    Operation operation = Operation.ADDITION;
    for (int index = 0; index < original.length(); index++) {
      char val = original.charAt(index);
      String nextToAdd = null;
      switch (val) {
        case Bracket.STANDARD_OPENING_BRACKET:
          int endIndex = Bracket.findEndingBracketIndex(original, index);
          if (index == 0 && endIndex == original.length() - 1) {
            continue;
          }
          Expression innerExpression = new Expression(
              original.substring(index + 1, endIndex)
          );
          expressionMap.put(index, innerExpression);
          nextToAdd = innerExpression.reduce().getOriginal();
          index = endIndex;
          break;
        case Bracket.STANDARD_CLOSING_BRACKET:
          break;
        default:
          if (Character.isSpaceChar(val)) {
            continue;
          }
          if (!Character.isDigit(val)) {
            operation = new Operation(val);
            continue;
          }
          StringBuilder digit = new StringBuilder();
          while (index < original.length()) {
            val = original.charAt(index);
            if (Character.isDigit(val)) {
              digit.append(val);
              index++;
            } else {
              break;
            }
          }
          nextToAdd = digit.toString();
      }
      if (index >= original.length() - 1 && nextToAdd == null) {
        nextExpression.append(tempValue);
        continue;
      }
      try {
        tempValue = operation.operate(tempValue, Long.valueOf(nextToAdd));
        if (index >= original.length() - 1) {
          nextExpression.append(tempValue);
        }
      } catch (IllegalArgumentException e) {
        nextExpression.append(tempValue);
        nextExpression.append(" ");
        nextExpression.append(operation.toString());
        nextExpression.append(" ");
        if (StringUtil.isNumber(nextToAdd)) {
          tempValue = Long.valueOf(nextToAdd);
          if (index >= original.length() - 1) {
            nextExpression.append(tempValue);
          }
        } else if (nextToAdd != null) {
          nextExpression.append(nextToAdd + " ");
        }
        operation = Operation.ADDITION;
      }
    }

    if (nextExpression.length() > 0 && !StringUtil.isNumber(nextExpression.toString().trim())) {
      nextExpression.insert(0, Bracket.STANDARD_OPENING_BRACKET);
      nextExpression.append(Bracket.STANDARD_CLOSING_BRACKET);
    }

    return new Expression(nextExpression.toString().trim());
  }

  private void calculateValue() {
    if (StringUtil.isNumber(original)) {
      value = Long.valueOf(original);
      return;
    }
    value = new Expression(original).reduce().getValue();
  }

  public String getOriginal() {
    return original;
  }

  public long getValue() {
    calculateValue();
    return value;
  }
}
