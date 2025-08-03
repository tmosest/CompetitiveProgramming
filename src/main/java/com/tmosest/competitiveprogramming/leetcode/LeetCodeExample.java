package com.tmosest.competitiveprogramming.leetcode;

public class LeetCodeExample {
    public int index;
    public String input;
    public String output;
    public String explantion;

    public LeetCodeExample(String inputLine) {
        index = Integer.parseInt(inputLine.replace("Example", "").replace(":", "").trim());
    }

    public String getInput() {
        String in = input.replace("Input:", "").trim();
        return in;
    }

    public String getOutput() {
        return input.replace("Output:", "").trim();
    }

    public String toString() {
        return String.format("Example %d\n%s\n%s\n%s\n", index, input, output, explantion);
    }
}
