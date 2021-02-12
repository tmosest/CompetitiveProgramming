package com.tmosest.competitiveprogramming.leetcode.advent;

import com.tmosest.competitiveprogramming.datastructures.implementations.Expression;
import com.tmosest.competitiveprogramming.datastructures.implementations.Operation;

import java.util.List;

class OperationOrder {

  long sumLines(List<String> input) {
    return input.stream()
        .map(Expression::new)
        .map(Expression::getValue)
        .reduce(Long::sum)
        .orElse(-1L);
  }

  long sumLinesWithAddition(List<String> input) {
    final String tempSympbol = "!";
    return input.stream()
        .map(str -> str.replace("" + Operation.MULTIPLICATION_SYMBOL, tempSympbol))
        .map(Expression::new)
        .map(Expression::reduce)
        .map(expression -> new Expression(
            expression.getOriginal().replace(tempSympbol,
                "" + Operation.MULTIPLICATION_SYMBOL)))
        .map(Expression::getValue)
        .reduce(Long::sum)
        .orElse(-1L);
  }
}
