package hackerrank.implementation.tests;

import java.util.ArrayList;
import org.junit.Test;

public class CutTheSticksTest {

  @Test
  public void test() {
    int[] sticks = {
        5, 4, 4, 2, 2, 8, 
    };
    ArrayList<Integer> sticksList = new ArrayList<Integer>();
    for(int i = 0; i < sticks.length; i++) {
      sticksList.add(sticks[i]);
    }
    int[] answers = {
        6,
        4,
        2,
        1,
    };
    ArrayList<Integer> answersList = new ArrayList<Integer>();
    for(int i = 0; i < answers.length; i++) {
      answersList.add(answers[i]);
    }
    //Assert.assertTrue(answersList.equals(CutTheSticks.cutTheSticks(sticksList)));
  }

}
