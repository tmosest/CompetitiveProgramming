package com.tmosest.competitiveprogramming.leetcode.common;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {
    
    /**
     * Converts something like:
     * 
     * [["a","0549"],["b","0457"],["a","0532"],["a","0621"],["b","0540"]]
     * 
     * Into a list of list of strings.
     * 
     * @param str
     * @return
     */
    public static List<List<String>> fromString(String str) {
        str = str.replace("[[", "[").replace("]]", "]");
        
        List<List<String>> result = new ArrayList<>();

        for (String item : str.split("],")) {
            item = item.replace("[", "");
            List<String> list = new ArrayList<>();
            for (String inner : item.split(",")) {
                list.add(inner.replace("\"", "").replace("]", ""));
            }
            result.add(list);
        }

        return result;
    }
}
