package com.tmosest.competitiveprogramming.leetcode.advent;

import com.tmosest.competitiveprogramming.utils.string.StringUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

class CustomCustoms {

  long sumYesAnswersForAllGroups(List<String> fileLines) {
    Function<String, Long> function =
        (str) -> (long) new Group(str).getAllUniqueYesForGroupSize();
    return streamAndReduce(fileLines, function);
  }

  long sumYesAnswersForEveryoneInGroups(List<String> fileLines) {
    Function<String, Long> function =
        (str) -> (long) new Group(str).getAnswersEveryoneAnsweredYesToSize();
    return streamAndReduce(fileLines, function);
  }

  private long streamAndReduce(List<String> fileLines, Function<String, Long> function) {
    return StringUtil.fromLineSeperatedToSpaceSeperated(fileLines).stream()
        .mapToLong(str -> function.apply(str))
        .reduce((one, two) -> one + two).orElse(-1);
  }

  private static class Group {

    private Set<Character> uniqueAnswers;
    private Set<Character> answersEveryoneAnsweredYesTo;

    private Group(String yesAnswersForGroup) {
      String[] answersByPerson = yesAnswersForGroup.split(" ");

      uniqueAnswers = Arrays.stream(answersByPerson)
          .flatMap(str -> str.chars().mapToObj(i -> (char) i))
          .collect(Collectors.toSet());

      answersEveryoneAnsweredYesTo = uniqueAnswers.stream().filter(answer ->
        Arrays.stream(answersByPerson)
            .filter(person -> person.contains(answer + ""))
            .count() == answersByPerson.length
      ).collect(Collectors.toSet());
    }

    private int getAllUniqueYesForGroupSize() {
      return uniqueAnswers.size();
    }

    private int getAnswersEveryoneAnsweredYesToSize() {
      return answersEveryoneAnsweredYesTo.size();
    }
  }
}
