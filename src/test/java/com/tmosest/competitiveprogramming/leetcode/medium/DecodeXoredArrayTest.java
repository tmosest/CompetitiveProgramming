package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc223")
@DisplayName("LeetCode: 1720. Decode XORed Array")
class DecodeXoredArrayTest {
    private DecodeXoredArray decodeXoredArray;

    @BeforeEach
    void setup() {
        decodeXoredArray = new DecodeXoredArray();
    }

    private void test(int[] output, int[] encoded, int first) {
        Assertions.assertArrayEquals(output, decodeXoredArray.decode(encoded, first));
    }

    @Test
    void test0() {
        test(new int[] {1,0,2,1}, new int[] {1,2,3}, 1);
    }
}
