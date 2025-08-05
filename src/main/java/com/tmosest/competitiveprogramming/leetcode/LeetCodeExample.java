package com.tmosest.competitiveprogramming.leetcode;

import java.util.HashMap;
import java.util.Map;

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
        String out = output.replace("Output:", "").trim();
        return out;
    }

    public String getParamters(String parametersNames) {
        
        String in = getInput();
        Map<String, String> paramsMap = new HashMap<>();

        for(String param : in.split(", ")) {
            String[] keyVal = param.split("=");
            paramsMap.put(keyVal[0].trim(), keyVal[1].trim());
        }

        StringBuilder sb = new StringBuilder();

        for(String param : parametersNames.split(", ")) {
            sb.append(paramsMap.getOrDefault(param.trim(), param));
            sb.append(", ");
        }

        return sb.toString();
    }

    public String toString() {
        return String.format("Example %d\n%s\n%s\n%s\n", index, input, output, explantion);
    }
}
