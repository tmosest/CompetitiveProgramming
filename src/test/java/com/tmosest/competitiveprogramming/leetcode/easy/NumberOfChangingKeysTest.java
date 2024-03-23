package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("wc382")
@DisplayName("LeetCode: 3019. Number of Changing Keys")
class NumberOfChangingKeysTest {
    private NumberOfChangingKeys numberOfChangingKeys;

    @BeforeEach
    void setup() {
        numberOfChangingKeys = new NumberOfChangingKeys();
    }

    private void test(int output, String s) {
        Assertions.assertEquals(output, numberOfChangingKeys.countKeyChanges(s));
    }

    @Test
    void test0() {
        test(2, "aAbBcC");
    }
}
