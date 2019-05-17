package com.tmosest.competitiveprogramming.kata.twentyfourtyeight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TwentyFortyEightGameTest {

  private TwentyFortyEightGame twentyFortyEightGame = new TwentyFortyEightGame();

  @BeforeEach
  void start_new_game() {
    twentyFortyEightGame.startNewGame();
  }

  @Test
  @DisplayName("Default Score is 0")
  void default_score_is_zero() {
    Assertions.assertEquals(0, twentyFortyEightGame.getScore());
  }

  @Test
  @DisplayName("New game should start with two 2's in random positions and be empty otherwise")
  void check_initial_setup() {
    int[][] board = twentyFortyEightGame.getBoard();
    int count = 0;
    for (int[] row : board) {
      for (int val : row) {
        if (val != 0) {
          count++;
        }
      }
    }
    Assertions.assertEquals(2, count);
  }

  @Test
  @DisplayName("Moving up generates a new piece to the board")
  void should_generate_a_new_piece_when_moving_up() {
    twentyFortyEightGame.moveUp();
    int[][] board = twentyFortyEightGame.getBoard();
    int count = 0;
    for (int row = 0; row < 4; row++) {
      for (int col = 0; col < 4; col++) {
        if (board[row][col] != 0) {
          if (row != 0 && board[row - 1][col] == 0) {
            count++;
            Assertions.assertEquals(1, count);
          }
        }
      }
    }
  }

  @Test
  @DisplayName("Moving up can merge pieces")
  void should_merge_up() {
    int[][] board = {
        {0, 2, 0, 0},
        {0, 2, 0, 0},
        {0, 0, 0, 0},
        {0, 0, 0, 4}
    };
    twentyFortyEightGame.setBoard(board);
    twentyFortyEightGame.moveUp();
    board = twentyFortyEightGame.getBoard();
    Assertions.assertEquals(4, board[0][1]);
  }

  @Test
  @DisplayName("Moving left shifts pieces left and generates a new piece")
  void should_move_left_and_generate_new_piece() {
    twentyFortyEightGame.moveLeft();
    int[][] board = twentyFortyEightGame.getBoard();
    int count = 0;
    for (int row = 0; row < 4; row++) {
      for (int col = 0; col < 4; col++) {
        if (board[row][col] != 0) {
          if (col != 0 && board[row][col - 1] == 0) {
            count++;
            Assertions.assertEquals(1, count);
          }
        }
      }
    }
  }

  @Test
  @DisplayName("Moving left can merge pieces")
  void should_merge_left() {
    int[][] board = {
        {2, 2, 0, 0},
        {0, 0, 0, 0},
        {0, 0, 0, 0},
        {0, 0, 4, 0}
    };
    twentyFortyEightGame.setBoard(board);
    twentyFortyEightGame.moveLeft();
    board = twentyFortyEightGame.getBoard();
    Assertions.assertEquals(4, board[0][0]);
  }

  @Test
  @DisplayName("Moving right shifts pieces right and generates a new piece")
  void should_move_right_and_generate_new_piece() {
    twentyFortyEightGame.moveRight();
    int[][] board = twentyFortyEightGame.getBoard();
    int count = 0;
    for (int row = 0; row < 4; row++) {
      for (int col = 0; col < 4; col++) {
        if (board[row][col] != 0) {
          if (col != board.length - 1 && board[row][col + 1] == 0) {
            count++;
            Assertions.assertEquals(1, count);
          }
        }
      }
    }
  }

  @Test
  @DisplayName("Moving right can merge pieces")
  void should_merge_right() {
    int[][] board = {
        {2, 2, 0, 0},
        {0, 0, 0, 0},
        {0, 0, 0, 0},
        {4, 0, 0, 0}
    };
    twentyFortyEightGame.setBoard(board);
    twentyFortyEightGame.moveRight();
    board = twentyFortyEightGame.getBoard();
    Assertions.assertEquals(4, board[0][3]);
  }

  @Test
  @DisplayName("Moving down shifts pieces down and generates a new piece")
  void should_move_down_and_generate_new_piece() {
    twentyFortyEightGame.moveDown();
    int[][] board = twentyFortyEightGame.getBoard();
    int count = 0;
    for (int row = 0; row < 4; row++) {
      for (int col = 0; col < 4; col++) {
        if (board[row][col] != 0) {
          if (row != board.length - 1 && board[row + 1][col] == 0) {
            count++;
            Assertions.assertEquals(1, count);
          }
        }
      }
    }
  }

  @Test
  @DisplayName("Moving down can merge pieces")
  void should_merge_down() {
    int[][] board = {
        {0, 2, 0, 0},
        {0, 2, 0, 0},
        {0, 0, 0, 0},
        {0, 0, 0, 4}
    };
    twentyFortyEightGame.setBoard(board);
    twentyFortyEightGame.moveDown();
    board = twentyFortyEightGame.getBoard();
    Assertions.assertEquals(4, board[3][1]);
  }

  @Test
  @DisplayName("Should not be game over if there is an empty space")
  void should_not_be_game_over_if_there_is_an_empty_space() {
    Assertions.assertFalse(twentyFortyEightGame.isGameOver());
  }

  @Test
  @DisplayName("Should not be game over if we can merge up or down")
  void should_not_be_game_over_if_can_move_vertical() {
    int[][] board = {
        {1, 2, 100, 3},
        {1, 6, 5, 4},
        {7, 8, 9, 10},
        {100, 101, 102, 103}
    };
    twentyFortyEightGame.setBoard(board);
    Assertions.assertFalse(twentyFortyEightGame.isGameOver());
  }

  @Test
  @DisplayName("Should not be game over if we can merge left or right")
  void should_not_be_game_over_if_can_move_horizontal() {
    int[][] board = {
        {4, 2, 2, 3},
        {1, 6, 5, 4},
        {7, 8, 9, 10},
        {100, 101, 102, 103}
    };
    twentyFortyEightGame.setBoard(board);
    Assertions.assertFalse(twentyFortyEightGame.isGameOver());
  }

  @Test
  @DisplayName("Is game over if we cannot move or generate a piece")
  void should_be_game_over_if_we_cannot_move() {
    int[][] board = {
        {4, 2, 100, 3},
        {1, 6, 5, 4},
        {7, 8, 9, 10},
        {100, 101, 102, 103}
    };
    twentyFortyEightGame.setBoard(board);
    Assertions.assertTrue(twentyFortyEightGame.isGameOver());
  }

  @Test
  @DisplayName("Can get board and score as a string")
  void should_be_able_generate_a_string() {
    Assertions.assertNotEquals("", twentyFortyEightGame.toString());
  }
}
