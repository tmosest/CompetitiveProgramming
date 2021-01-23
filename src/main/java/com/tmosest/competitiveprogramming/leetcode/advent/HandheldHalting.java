package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class HandheldHalting {

  private long accumulator;

  long getAccumulatorBeforeLoop(List<String> fileLines) {
    Set<Integer> indexes = new HashSet<>();
    State state = new State();
    while (state != null && !indexes.contains(state.index) && state.index < fileLines.size()) {
      indexes.add(state.index);
      state = Operation.fromString(
          fileLines.get(state.index)
      ).updateState(state);
    }
    return state.accumulator;
  }

  long getAccumulatorAfterTermination(List<String> fileLines) {
    accumulator = 0;
    State state = new State();
    Set<Integer> indexes = new HashSet<>();
    getAccumulatorAfterTerminationHelper(
        state,
        Operation.fromString(fileLines.get(state.index)),
        fileLines,
        indexes,
        false
    );
    return accumulator;
  }

  private Operation getNext(int index, List<String> fileLines) {
    return index >= fileLines.size() ? null : Operation.fromString(fileLines.get(index));
  }

  private void getAccumulatorAfterTerminationHelper(State state, Operation operation,
      List<String> fileLines, Set<Integer> set, boolean hasChange) {

    if (set.contains(state.index) || state.index > fileLines.size()) {
      return;
    }

    set.add(state.index);

    if (state.index == fileLines.size()) {
      accumulator = state.accumulator;
      return;
    }

    if (operation.getClass() == Accumulator.class) {
      State accumState = operation.updateState(state);
      getAccumulatorAfterTerminationHelper(
          accumState,
          getNext(accumState.index, fileLines),
          fileLines,
          new HashSet<>(set),
          hasChange
      );
      return;
    }

    State jumpState = new Jump(operation.val).updateState(state);
    boolean isDiff = operation.getClass() != Jump.class;
    if (!hasChange || !isDiff) {
      boolean nextHasChange = hasChange || isDiff;
      getAccumulatorAfterTerminationHelper(
          jumpState,
          getNext(jumpState.index, fileLines),
          fileLines,
          new HashSet<>(set),
          nextHasChange
      );
    }

    State noopState = new Noop().updateState(state);
    isDiff = operation.getClass() != Noop.class;
    if (!hasChange || !isDiff) {
      boolean nextHasChange = hasChange || isDiff;
      getAccumulatorAfterTerminationHelper(
          noopState,
          getNext(noopState.index, fileLines),
          fileLines,
          new HashSet<>(set),
          nextHasChange
      );
    }
  }

  private static class State {

    int index = 0;
    long accumulator = 0;

    static State fromState(State state) {
      State state1 = new State();
      state1.index = state.index;
      state1.accumulator = state.accumulator;
      return state1;
    }
  }

  private abstract static class Operation {

    private String operation;
    private int val;

    private Operation() {
    }

    private Operation(String operation, int val) {
      this.operation = operation;
      this.val = val;
    }

    private static Operation fromString(String input) {
      String[] keyValue = input.split(" ");
      String operation = keyValue[0].trim();
      int val = Integer.valueOf(keyValue[1].trim());

      switch (operation) {
        case Jump.OPERATION:
          return new Jump(val);
        case Accumulator.OPERATION:
          return new Accumulator(val);
        case Noop.OPERATION:
          return new Noop();
        default:
          return null;
      }
    }

    abstract State updateState(State state);

    public int getVal() {
      return val;
    }

    public String getOperation() {
      return operation;
    }
  }

  private static class Noop extends Operation {

    private static final String OPERATION = "nop";

    State updateState(State state) {
      State state1 = State.fromState(state);
      state1.index++;
      return state1;
    }
  }

  private static class Accumulator extends Operation {

    private static final String OPERATION = "acc";

    private Accumulator(int val) {
      super(OPERATION, val);
    }

    State updateState(State state) {
      State state1 = State.fromState(state);
      state1.index++;
      state1.accumulator += this.getVal();
      return state1;
    }
  }

  private static class Jump extends Operation {

    private static final String OPERATION = "jmp";

    private Jump(int val) {
      super(OPERATION, val);
    }

    State updateState(State state) {
      State state1 = State.fromState(state);
      state1.index += this.getVal();
      return state1;
    }
  }
}
