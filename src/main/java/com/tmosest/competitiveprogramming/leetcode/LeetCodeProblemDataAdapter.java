package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.Getter;

public class LeetCodeProblemDataAdapter {

    @Getter
    private LeetCodeProblemData problemData;

    public LeetCodeProblemDataAdapter(String contest, String problem) {
        String[] problemData = problem.split(";=;=");

        if (problemData.length < 4) {
            this.problemData = null;
            return;
        }

        LeetCodeProblemData.LeetCodeProblemDataBuilder builder = 
            LeetCodeProblemData.builder()
                .contest(contest)
                .numberName(problemData[1])
                .functionDeclaration(problemData[3].replaceAll("�", " "))
                .description(problemData[4])
                .url(problemData[5])
                .solutionUrls(problemData[6].replaceAll(";;", "\n"))
                .types(Arrays.asList())
                .difficulty( problemData[2].toLowerCase());


        this.problemData = builder.build();
    }
}
