package com.tmosest.competitiveprogramming.hackerrank.wcs.wcs12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// http://www.geeksforgeeks.org/print-all-possible-combinations-of-r-elements-in-a-given-array-of-size-n/
public class AnimalTransport {

  public static boolean debugMode = false;

  /**
   * Funtion to try to solve the problem.
   */
  public static void solve() {
    Scanner in = new Scanner(System.in);
    int tests = in.nextInt();
    for (int t = 0; t < tests; t++) {
      int zoos = in.nextInt();
      int animals = in.nextInt();
      RouteManager routeManager = new RouteManager(zoos, animals);
      in.nextLine();
      String[] symbols = in.nextLine().split(" ");
      int[] sources = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();
      int[] destinations =
          Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();
      for (int i = 0; i < animals; i++) {
        routeManager.addAnimalRoute(symbols[i], sources[i], destinations[i]);
      }
      if (debugMode) {
        System.out.println(routeManager.toString());
      }
      int[] result = routeManager.findMinimumZoos();
      for (int i = 0; i < result.length; i++) {
        System.out.print(result[i] + " ");
      }
      System.out.println();
    }
    in.close();
  }

  public static void main(String[] args) {
    solve();
  }

  private static class Line {

    public int start;
    public int stop;

    public Line(int start, int stop) {
      if (start < stop) {
        this.start = start;
        this.stop = stop;
      } else {
        this.start = stop;
        this.stop = start;
      }
    }

    public boolean intersects(Line line) {
      boolean contains = this.stop > line.start && this.start < line.stop;
      return contains;
    }

    public String toString() {
      return "Line { start: " + start + ", stop: " + stop + " }";
    }
  }

  public static class Animal {

    AnimalType type;

    /**
     * Animal Constructor.
     *
     * @param type Character representing animal type {D, E, C, M}
     */
    public Animal(char type) {
      switch (type) {
        case 'D':
          this.type = AnimalType.DOG;
          break;
        case 'E':
          this.type = AnimalType.ELEPHANT;
          break;
        case 'C':
          this.type = AnimalType.CAT;
          break;
        default:
          this.type = AnimalType.MOUSE;
      }
    }

    /**
     * Function to determine if two animals are compatible or not.
     *
     * @param animal Other animal to check against.
     * @return true if they are compatible and false otherwise.
     */
    public boolean isIncompatibleTypes(Animal animal) {
      return
          // DOG != Elephant
          (animal.type == AnimalType.DOG && this.type == AnimalType.ELEPHANT)
              || (animal.type == AnimalType.ELEPHANT && this.type == AnimalType.DOG)
              // Cat != Dog
              || (animal.type == AnimalType.CAT && this.type == AnimalType.DOG)
              || (animal.type == AnimalType.DOG && this.type == AnimalType.CAT)
              // Mouse != Cat
              || (animal.type == AnimalType.MOUSE && this.type == AnimalType.CAT)
              || (animal.type == AnimalType.CAT && this.type == AnimalType.MOUSE)
              // Elephant != Mouse
              || (animal.type == AnimalType.ELEPHANT && this.type == AnimalType.MOUSE)
              || (animal.type == AnimalType.MOUSE && this.type == AnimalType.ELEPHANT);
    }

    public String toString() {
      return "Animal: { type: " + this.type.toString() + " }";
    }

    public static enum AnimalType {
      DOG, ELEPHANT, CAT, MOUSE
    }
  }

  private static class AnimalRoute {

    public Animal animal;
    public Line route;

    public AnimalRoute(String type, int from, int to) {
      this.animal = new Animal(type.charAt(0));
      this.route = new Line(from, to);
    }

    public boolean isCompatibleRoute(AnimalRoute ar) {
      boolean comptibleAnimals = !this.animal.isIncompatibleTypes(ar.animal);
      boolean result = comptibleAnimals || (!comptibleAnimals && !this.route.intersects(ar.route));
      return result;
    }

    public String toString() {
      return "\tAnimalRoute: { " + animal.toString() + ", " + route.toString() + " }";
    }
  }

  private static class AnimalRouteGroup {

    public Set<AnimalRoute> group;
    public int[] destinations = null;

    public AnimalRouteGroup() {
      this.group = new HashSet<AnimalRoute>();
    }

    public boolean addToGroup(AnimalRoute ar) {
      boolean result = true;
      // If new group add
      if (group.size() == 0) {
        this.group.add(ar);
        return result;
      }
      for (AnimalRoute anRoute : this.group) {
        if (!anRoute.isCompatibleRoute(ar)) {
          result = false;
          break;
        }
      }
      if (result) {
        group.add(ar);
      }
      return result;
    }

    public int nthSmalledDestination(int nth) {
      int size = group.size();
      if (nth >= size) {
        return Integer.MAX_VALUE;
      }
      if (destinations == null) {
        destinations = new int[size];
        int index = 0;
        for (AnimalRoute ar : group) {
          destinations[index++] = ar.route.stop;
        }
        Arrays.sort(destinations);
      }
      return destinations[nth];
    }

    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("\tAnimalRouteGroup: {\n");
      for (AnimalRoute ar : group) {
        sb.append("\t" + ar.toString() + ",\n");
      }
      sb.append("\t}");
      return sb.toString();
    }
  }

  private static class RouteManager {

    private Set<AnimalRouteGroup> animalRoutesGroups;
    private int[] minimumZooForCount;
    private int zoos;

    public RouteManager(int zoos, int animals) {
      this.animalRoutesGroups = new HashSet<AnimalRouteGroup>();
      this.minimumZooForCount = new int[animals];
      this.zoos = zoos;
    }

    public void addAnimalRoute(String symbol, int from, int to) {
      AnimalRoute ar = new AnimalRoute(symbol, from, to);
      if (debugMode) {
        System.out.println("Trying to add");
        System.out.println(ar.toString());
      }
      boolean couldAddToGroup = false;
      for (AnimalRouteGroup arg : this.animalRoutesGroups) {
        if (arg.addToGroup(ar)) {
          couldAddToGroup = true;
        }
      }
      if (!couldAddToGroup) {
        AnimalRouteGroup arg = new AnimalRouteGroup();
        arg.addToGroup(ar);
        this.animalRoutesGroups.add(arg);
      }
    }

    public int[] findMinimumZoos() {
      for (int i = 0; i < minimumZooForCount.length; i++) {
        int smallest = Integer.MAX_VALUE;
        for (AnimalRouteGroup arg : animalRoutesGroups) {
          smallest = Math.min(smallest, arg.nthSmalledDestination(i));
        }
        minimumZooForCount[i] = (smallest == Integer.MAX_VALUE) ? -1 : smallest;
      }
      return minimumZooForCount;
    }

    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("RouteManager: {\n");
      for (AnimalRouteGroup arg : animalRoutesGroups) {
        sb.append(arg.toString() + ",\n");
      }
      sb.append("}\n");
      return sb.toString();
    }
  }

}
