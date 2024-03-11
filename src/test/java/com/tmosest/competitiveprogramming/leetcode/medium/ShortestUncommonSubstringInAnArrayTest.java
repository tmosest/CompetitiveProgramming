package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc388")
@DisplayName("LeetCode: 3076. Shortest Uncommon Substring in an Array")
class ShortestUncommonSubstringInAnArrayTest {
    private ShortestUncommonSubstringInAnArray shortestUncommonSubstringInAnArray;

    @BeforeEach
    void setup() {
        shortestUncommonSubstringInAnArray = new ShortestUncommonSubstringInAnArray();
    }

    private void test(String[] output, String[] arr) {
        Assertions.assertArrayEquals(output, shortestUncommonSubstringInAnArray.shortestSubstrings(arr));
    }

    @Test
    void test0() {
        test(new String[] {"ab", "", "ba", ""}, new String[] {"cab", "ad", "bad", "c"});
    }

    @Test
    void test1() {
        test(new String[] {"","","abcd"}, new String[] {"abc","bcd","abcd"});
    }

    @Test
    void test2() {
        test(new String[] {"g","x","z","r","i","c","h"}, new String[] {"gfnt","xn","mdz","yfmr","fi","wwncn","hkdy"});
    }
}
