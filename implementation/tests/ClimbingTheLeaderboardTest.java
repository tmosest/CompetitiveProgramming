package implementation.tests;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
import implementation.ClimbingTheLeaderboard;

public class ClimbingTheLeaderboardTest {

  @Test
  public void test() {
    int[] scoreBoard = {100, 100, 50, 40, 40, 20, 10,};
    int[] aliceScores = {5, 25, 50, 120,};
    int[] expectedRanks = {6, 4, 2, 1};
    Assert.assertArrayEquals(expectedRanks,
        ClimbingTheLeaderboard.determineRanks(scoreBoard, aliceScores));
  }

}
