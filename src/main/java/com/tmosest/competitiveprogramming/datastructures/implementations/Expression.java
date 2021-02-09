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

  // Will reduce to simplified form based on operations it knows.
  public Expression reduce() {
    StringBuilder nextExpression = new StringBuilder();

    long tempValue = 0;
    Operation operation = Operation.ADDITION;
    for (int index = 0; index < original.length(); index++) {
      char val = original.charAt(index);
      String nextToAdd = null;
      switch (val) {
        case Bracket.STANDARD_OPENING_BRACKET:
          if (index == 0) {
            continue;
          }
          int endIndex = Bracket.findEndingBracketIndex(original, index);
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
          nextToAdd = "" + val;
      }
      if (index == original.length() - 1 && nextToAdd == null) {
        nextExpression.append(tempValue);
        continue;
      }
      try {
        tempValue = operation.operate(tempValue, Integer.valueOf(nextToAdd));
        if (index == original.length() - 1) {
          nextExpression.append(tempValue);
        }
      } catch (IllegalArgumentException e) {
        nextExpression.append(tempValue);
        nextExpression.append(" ");
        nextExpression.append(operation.toString());
        nextExpression.append(" ");
        if (StringUtil.isNumber(nextToAdd)) {
          tempValue = Integer.valueOf(nextToAdd);
          if (index == original.length() - 1) {
            nextExpression.append(tempValue);
          }
        } else {
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
      value = Integer.valueOf(original);
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
