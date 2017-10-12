package implementations.tests;

import org.junit.Test;
import implementation.QueensAttackII;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.junit.Assert;

public class QueensAttackIITest {

  BufferedReader in = null;
  BufferedReader out = null;
  
  @Test
  public void testCase0() {
    int boardSize = 4;
    int[] queenPosition = {4, 4};
    int[][] blockers = new int[0][0];
    int[][] testBlock = {{4, 4}};
    QueensAttackII.addBlockersToBoard(boardSize, blockers);
    Assert.assertEquals(9, QueensAttackII.numberOfQueenMoves(boardSize, queenPosition, blockers));
  }

  @Test
  public void testCase1() {
    int boardSize = 5;
    int[] queenPosition = {4, 3};
    int[][] blockers = {{4, 3}, {5, 5}, {4, 2}, {2, 3}};
    QueensAttackII.addBlockersToBoard(boardSize, blockers);
    Assert.assertEquals(10, QueensAttackII.numberOfQueenMoves(boardSize, queenPosition, blockers));
  }

  @Test
  public void testCase3() {
    int boardSize = 100000;
    int[] queenPosition = {4187, 5068};
    int[][] blockers = new int[0][0];
    Assert.assertEquals(308369,
        QueensAttackII.numberOfQueenMoves(boardSize, queenPosition, blockers));
    QueensAttackII.addBlockersToBoard(boardSize, blockers);
    Assert.assertEquals(308369, QueensAttackII.numberOfQueenMovesFast(boardSize, queenPosition));
  }
  /*
  @Test
  public void testCase17() throws IOException {
    File directory = new File("implementations/tests/data/QueensAttackII/");
    System.out.println(directory.getAbsolutePath());
    
    File inputFile = new File("implementations/tests/data/QueensAttackII/input17.txt");  
    File outputFile = new File("implementations/tests/data/QueensAttackII/input17.txt");  
    
    in = new BufferedReader(new FileReader(inputFile));
    
    out = new BufferedReader(new FileReader(outputFile));
    
    String[] line1 = in.readLine().split(" ");
    
    int boardSize = Integer.parseInt(line1[0]);
    int blockerSize = Integer.parseInt(line1[1]);
    
    String[] line2 = in.readLine().split(" ");
    
    int[] queen = new int[2];
    
    queen[0] = Integer.parseInt(line2[0]);
    queen[1] = Integer.parseInt(line2[1]);
    
    int[][] blockers = new int[blockerSize][blockerSize];
    
    for(int i = 0; i < blockerSize; i++) {
      String[] line = in.readLine().split(" ");
      blockers[i][0] = Integer.parseInt(line2[0]);
      blockers[i][1] = Integer.parseInt(line2[1]);
    }
    
    int answer = Integer.parseInt(out.readLine());
    
    Assert.assertEquals(answer, QueensAttackII.numberOfQueenMoves(boardSize, queen, blockers));
    
    QueensAttackII.addBlockersToBoard(boardSize, blockers);
    
    Assert.assertEquals(answer, QueensAttackII.numberOfQueenMovesFast(boardSize, queen));
  }
  */
}
