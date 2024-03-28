package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("floydWarshal")
@Tag("wc377")
@DisplayName("LeetCode: 2976. Minimum Cost to Convert String I")
class MinimumCostToConvertStringOneTest {
    private MinimumCostToConvertStringOne minimumCostToConvertStringOne;

    @BeforeEach
    void setup() {
        minimumCostToConvertStringOne = new MinimumCostToConvertStringOne();
    }

    private void test(long output, String source, String target, char[] original, char[] changed, int[] cost) {
        Assertions.assertEquals(output,
                minimumCostToConvertStringOne.minimumCost(source, target, original, changed, cost));
    }

    @Test
    void test0() {
        test(28L, "abcd", "acbe", new char[] { 'a', 'b', 'c', 'c', 'e', 'd' },
                new char[] { 'b', 'c', 'b', 'e', 'b', 'e' }, new int[] { 2, 5, 5, 1, 2, 20 });
    }
}
