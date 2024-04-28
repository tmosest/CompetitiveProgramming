package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("list")
@Tag("primes")
@Tag("wc352")
@DisplayName("LeetCode: 2761. Prime Pairs With Target Sum")
class PrimePairsWithTargetSumTest {
    private PrimePairsWithTargetSum primePairsWithTargetSum;

    @BeforeEach
    void setup() {
        primePairsWithTargetSum = new PrimePairsWithTargetSum();
    }

    private void test(List<List<Integer>> output, int n) {
        Assertions.assertEquals(output, primePairsWithTargetSum.findPrimePairs(n));
    }

    @Test
    void test0() {
        test(List.of(List.of(3,7), List.of(5,5)), 10);
    }

    @Test
    void test1() {
        test(List.of(), 2);
    }

    @Test
    void test2() {
        test(List.of(List.of(3,31), List.of(5,29), List.of(11,23), List.of(17,17)), 34);
    }
}
