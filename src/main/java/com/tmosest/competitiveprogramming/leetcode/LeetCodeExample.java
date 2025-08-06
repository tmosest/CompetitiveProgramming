package com.tmosest.competitiveprogramming.leetcode;

import java.util.HashMap;
import java.util.List;
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

    public String getParamters(List<String> parameters) {
        
        String in = getInput();
        Map<String, String> paramsMap = new HashMap<>();

        for(String param : in.split(", ")) {
            String[] keyVal = param.split("=");
            paramsMap.put(keyVal[0].trim(), keyVal[1].trim());
        }

        StringBuilder sb = new StringBuilder();

        for(String param : parameters) {
            String[] paramArr = param.split(" ");
            String paramType = paramArr[0].trim();
            String paramName = paramArr[1].trim();

            String mapValue = paramsMap.getOrDefault(paramName.trim(), paramName);

            if (paramType.contains("[]")) {
                mapValue = mapValue.replace("[", "").replace("]", "");
                mapValue = "new " + paramType + " { " + mapValue + "}";
            } else if (paramType.contains("List<")) {
                mapValue = mapValue.replace("[", "").replace("]", "");
                mapValue = "List.of(" + mapValue + ")";
            }

            sb.append(mapValue);

            sb.append(", ");
        }

        sb.deleteCharAt(sb.length() - 2);

        return sb.toString().trim();
    }

    public String toString() {
        return String.format("Example %d\n%s\n%s\n%s\n", index, input, output, explantion);
    }
}
