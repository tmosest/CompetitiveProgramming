package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("string")
@Tag("wcx")
@DisplayName("LeetCode: 282. Expression Add Operators")
class ExpressionAddOperatorsTest {
    private ExpressionAddOperators expressionAddOperators;

    @BeforeEach
    void setup() {
        expressionAddOperators = new ExpressionAddOperators();
    }

    private void test(List<String> output, String num, int target) {
        Assertions.assertEquals(output, expressionAddOperators.addOperators(num, target));
    }

    @Test
    void test0() {
        test(List.of("1+2+3", "1*2*3"), "123", 6);
    }
}
