package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("gameTheory")
@Tag("depthFirstSearch")
@Tag("graph")
@Tag("matrix")
@Tag("wc224")
@DisplayName("LeetCode: 1728. Cat and Mouse II")
class CatAndMouseTwoTest {
    private CatAndMouseTwo catAndMouseTwo;

    @BeforeEach
    void setup() {
        catAndMouseTwo = new CatAndMouseTwo();
    }

    private void test(boolean output, String[] grid, int catJump, int mouseJump) {
        Assertions.assertEquals(output, catAndMouseTwo.canMouseWin(grid, catJump, mouseJump));
    }

    @Test
    void test0() {
        test(true, new String[] {"####F","#C...","M...."}, 1, 2);
    }
}
