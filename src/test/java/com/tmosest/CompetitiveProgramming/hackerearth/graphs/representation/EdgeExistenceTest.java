package com.tmosest.CompetitiveProgramming.hackerearth.graphs.representation;

import com.tmosest.CompetitiveProgramming.hackerrank.HackerrankUtil;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;

@DisplayName("HackerEarth Algorithms Graphs BFS: Monk and the Islands")
public class EdgeExistenceTest {

    private static void test(String input, String[] output, boolean debugMode)
            throws UnsupportedEncodingException {
        HackerrankUtil.setSystemIn(input);
        EdgeExistence.debugMode = debugMode;
        Assertions.assertArrayEquals(output, EdgeExistence.solve());
    }

    @Test
    @DisplayName("Test Case 0")
    void test() throws UnsupportedEncodingException {
        String input = "2 1\n" + "1 2\n" + "1\n" + "1 2\n";
        String[] output = {"YES"};
        test(input, output, false);
    }
}
