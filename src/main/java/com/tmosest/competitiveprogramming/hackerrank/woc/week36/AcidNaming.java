package com.tmosest.competitiveprogramming.hackerrank.woc.week36;

import java.util.Arrays;
import java.util.Scanner;

public class AcidNaming {

  public static boolean debugMode = false;

  private static final String NON_METAL_ACID = "non-metal acid";
  private static final String POLYATOMIC_ACID = "polyatomic acid";
  private static final String NOT_AN_ACID = "not an acid";

  /**
   * Uses the acids name to determine if what type of acid it is.
   *
   * @param name The name of the acid.
   * @return The type name.
   */
  private static String determineAcidType(String name) {
    // Check for ...ic
    if (name.startsWith("ic", name.length() - 2)) {
      // Check for hydro...
      if (name.startsWith("hydro")) {
        return NON_METAL_ACID;
      }
      return POLYATOMIC_ACID;
    }
    // Default not an acid
    return NOT_AN_ACID;
  }

  /**
   * For testing.
   *
   * @return String array of the acid types.
   */
  public static String[] solve() {
    Scanner in = new Scanner(System.in);

    int count = in.nextInt();
    String[] acids = new String[count];

    for (int i = 0; i < acids.length; i++) {
      acids[i] = in.next();
      acids[i] = determineAcidType(acids[i]);
    }

    in.close();

    return acids;
  }

  public static void main(String[] args) {
    Arrays.stream(solve()).forEach(System.out::println);
  }
}
