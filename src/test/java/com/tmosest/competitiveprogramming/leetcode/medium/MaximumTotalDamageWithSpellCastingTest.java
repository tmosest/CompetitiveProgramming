package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 3186. Maximum Total Damage With Spell Casting")
@Tag("wc402")
class MaximumTotalDamageWithSpellCastingTest {
    private MaximumTotalDamageWithSpellCasting maximumTotalDamageWithSpellCasting;

    @BeforeEach
    void setup() {
        maximumTotalDamageWithSpellCasting = new MaximumTotalDamageWithSpellCasting();
    }

    private void test(long output, int[] power) {
        Assertions.assertEquals(output, maximumTotalDamageWithSpellCasting.maximumTotalDamage(power));
    }
    /*
     * Example 1
     * Input: power = [1,1,3,4]
     * Output: 6
     * null
     */

    @Test
    void test_1() {
        test(6, new int[] { 1, 1, 3, 4 });
    }
    /*
     * Example 2
     * Input: power = [7,1,6,6]
     * Output: 13
     * null
     */

    @Test
    void test_2() {
        test(13, new int[] { 7, 1, 6, 6 });
    }

}