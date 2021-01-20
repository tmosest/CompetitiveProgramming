package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class BinaryBoarding {

  static int ROW_MULTIPLIER = 8;
  static int ROW_INDICATORS_LENGTH = 7;
  static int SEAT_INDICATORS_LENGTH = 3;
  static int ROW_COUNT = 128;
  static int SEAT_COUNT = 8;
  // TODO remove upperbound because it should be 2^COUNT - 1;
  static BinarySpacePartitioning rowFinder = new BinarySpacePartitioning(ROW_COUNT - 1);
  static BinarySpacePartitioning seatFinder = new BinarySpacePartitioning(SEAT_COUNT - 1);

  static BoardingPass passFromBinaryTicket(String boardingPass) {

    if (boardingPass == null
        || boardingPass.length() < SEAT_INDICATORS_LENGTH + ROW_INDICATORS_LENGTH) {
      throw new IllegalArgumentException("Please check boarding pass");
    }

    String rowPass = boardingPass.substring(0, ROW_INDICATORS_LENGTH);
    String seatPass = boardingPass.substring(ROW_INDICATORS_LENGTH);

    return new BoardingPass(rowFinder.getPos(rowPass), seatFinder.getPos(seatPass));
  }

  static long maxSeatId(List<String> boardingPasses) {
    return Flight.fromBoardingPasses(boardingPasses).getMaxSeatId();
  }

  static long findMySeat(List<String> boardingPasses) {
    Flight flight = Flight.fromBoardingPasses(boardingPasses);

    Set<Long> foundSeats = flight.getFoundSeats();

    for (Long missingSeatId : flight.getMissingSeats()) {
      if (foundSeats.contains(missingSeatId + 1) && foundSeats.contains(missingSeatId - 1)) {
        return missingSeatId;
      }
    }

    return -1;
  }

  static class BoardingPass {

    private int row;
    private int seat;

    BoardingPass(int row, int seat) {
      this.row = row;
      this.seat = seat;
    }

    public int getRow() {
      return row;
    }

    public int getSeat() {
      return seat;
    }

    long getSeatId() {
      return this.row * ROW_MULTIPLIER + this.seat;
    }
  }

  private static class BinarySpacePartitioning {

    private static String LOW_INDICATORS = "FL";
    private static String HIGH_INDICATORS = "BR";

    private int low;
    private int high;

    BinarySpacePartitioning(int high) {
      this.low = 0;
      this.high = high;
    }

    int getPos(String binarySpacePartitioning) throws IllegalArgumentException {
      int mid = (low + high) >>> 1;
      int low = this.low;
      int high = this.high;

      for (char letter : binarySpacePartitioning.toCharArray()) {
        if (HIGH_INDICATORS.contains(letter + "")) {
          low = mid + 1;
        } else if (LOW_INDICATORS.contains(letter + "")) {
          high = mid;
        } else {
          throw new IllegalArgumentException(letter + " :should be a low or high indicator");
        }
        mid = (low + high) >>> 1;
      }

      return mid;
    }
  }

  static class Flight {

    private long max;
    private Set<Long> foundSeats;
    private Set<Long> missingSeats;

    private Flight() {
      this.foundSeats = new HashSet<>();
      this.missingSeats = new HashSet<>();
    }

    static Flight fromBoardingPasses(List<String> boardingPasses) {
      Flight flight = new Flight();

      for (String boardingPass : boardingPasses) {
        flight.getFoundSeats().add(BinaryBoarding.passFromBinaryTicket(boardingPass).getSeatId());
      }

      flight.max = 0;
      for (Long seatId : flight.foundSeats) {
        flight.max = Math.max(flight.max, seatId);
      }

      for (long i = 0; i <= flight.max; i++) {
        if (!flight.getFoundSeats().contains(i)) {
          flight.getMissingSeats().add(i);
        }
      }

      return flight;
    }

    Set<Long> getFoundSeats() {
      return foundSeats;
    }

    Set<Long> getMissingSeats() {
      return missingSeats;
    }

    long getMaxSeatId() {
      return max;
    }
  }
}
