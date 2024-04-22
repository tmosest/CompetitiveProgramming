package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("wcx")
@Tag("set")
@Tag("breadthFirstSearch")
@Tag("array")
@DisplayName("LeetCode: 752. Open the Lock")
class OpenTheLockTest {
    private OpenTheLock openTheLock;

    @BeforeEach
    void setup() {
        openTheLock = new OpenTheLock();
    }

    private void test(int output, String[] deadends, String target) {
        Assertions.assertEquals(output, openTheLock.openLock(deadends, target));
    }

    @Test
    void test0() {
        test(6, new String[] {"0201","0101","0102","1212","2002"}, "0202");
    }
    
    @Test
    void test1() {
        test(1, new String[] {"8888"}, "0009");
    }

    /*
    @Test
    void test2() {
        test(-1, new String[] {"8887","8889","8878","8898","8788","8988","7888","9888"}, "8888");
    }
    */
}
