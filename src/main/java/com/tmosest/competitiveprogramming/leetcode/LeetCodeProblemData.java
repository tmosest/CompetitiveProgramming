package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Builder
public class LeetCodeProblemData {
    @Getter
    private String numberName;
    @Getter
    private String functionDeclaration;
    @Getter
    private String difficulty;
    @Getter
    private List<String> types;
    @Getter
    private String contest;
    @Getter
    private String description;
    @Getter
    private String url;
    @Getter
    private String solutionUrls;

    public String getFormattedFunctionDeclaration() {
        return String.format("/* %s\n\n %s \n\n %s \n\n %s */%s", numberName, url, description, solutionUrls,
                functionDeclaration);
    }

    // Breaks down "111. Sample Problem Name" into ["111", "Sample Problem Name"]
    public String[] formatIntoNumberAndName() {
        return numberName.split("\\.");
    }

    public String getName() {
        return formatIntoNumberAndName()[1].trim();
    }

    public List<LeetCodeExample> getLeetCodeExamples() {
        // Examples
        String[] descriptionLines = description.split("\n");
        List<LeetCodeExample> examples = new ArrayList<>();

        for (String descriptionLine : descriptionLines) {

            if (descriptionLine.startsWith("Example")) {
                examples.add(new LeetCodeExample(descriptionLine));
                continue;
            }

            if (descriptionLine.startsWith("Input:")) {
                LeetCodeExample example = examples.getLast();
                example.input = descriptionLine;
                continue;
            }

            if (descriptionLine.startsWith("Output:")) {
                LeetCodeExample example = examples.getLast();
                example.output = descriptionLine;
            }
        }
        return examples;
    }

    @Override
    public String toString() {
        return String.format("Problem %d\n%s\n%s\n%s\n", numberName, difficulty, functionDeclaration, types, contest);
    }
}
