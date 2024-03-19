package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc224")
@DisplayName("LeetCode: 1726. Tuple with Same Product")
class TupleWithSameProductTest {
    private TupleWithSameProduct tupleWithSameProduct;

    @BeforeEach
    void setup() {
        tupleWithSameProduct = new TupleWithSameProduct();
    }

    private void test(int output, int[] nums) {
        Assertions.assertEquals(output, tupleWithSameProduct.tupleSameProduct(nums));
    }

    @Test
    void test0() {
        test(8, new int[] { 2, 3, 4, 6 });
    }

    @Test
    void test1() {
        test(16, new int[] { 1, 2, 4, 5, 10 });
    }
}
