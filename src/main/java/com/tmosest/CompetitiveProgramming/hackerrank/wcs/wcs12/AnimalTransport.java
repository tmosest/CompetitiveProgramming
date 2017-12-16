package com.tmosest.CompetitiveProgramming.hackerrank.wcs.wcs12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// http://www.geeksforgeeks.org/print-all-possible-combinations-of-r-elements-in-a-given-array-of-size-n/
public class AnimalTransport {

  public static boolean debugMode = false;

  private static class Line {
    public int a;
    public int b;

    public Line(int a, int b) {
      if (a < b) {
        this.a = a;
        this.b = b;
      } else {
        this.a = b;
        this.b = a;
      }
    }

    public boolean intersects(Line line) {
      boolean contains = this.b > line.a && this.a < line.b;
      return contains;
    }

    public String toString() {
      return "Line { a: " + a + ", b: " + b + " }";
    }
  }

  public static class Animal {

    public static enum AnimalType {
      DOG, ELEPHANT, CAT, MOUSE
    }

    AnimalType type;

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

    public boolean isIncompatibleTypes(Animal a) {
      return
      // DOG != Elephant
      (a.type == AnimalType.DOG && this.type == AnimalType.ELEPHANT)
          || (a.type == AnimalType.ELEPHANT && this.type == AnimalType.DOG) ||
          // Cat != Dog
          (a.type == AnimalType.CAT && this.type == AnimalType.DOG)
          || (a.type == AnimalType.DOG && this.type == AnimalType.CAT) ||
          // Mouse != Cat
          (a.type == AnimalType.MOUSE && this.type == AnimalType.CAT)
          || (a.type == AnimalType.CAT && this.type == AnimalType.MOUSE) ||
          // Elephant != Mouse
          (a.type == AnimalType.ELEPHANT && this.type == AnimalType.MOUSE)
          || (a.type == AnimalType.MOUSE && this.type == AnimalType.ELEPHANT);
    }

    public String toString() {
      return "Animal: { type: " + this.type.toString() + " }";
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

    public int nthSmalledDestination(int n) {
      int size = group.size();
      if (n >= size)
        return Integer.MAX_VALUE;
      if(destinations == null) {
        destinations = new int[size];
        int index = 0;
        for (AnimalRoute ar : group) {
          destinations[index++] = ar.route.b;
        }
        Arrays.sort(destinations);
      }
      return destinations[n];
    }

    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("\tAnimalRouteGroup: {\n");
      for (AnimalRoute ar : group)
        sb.append("\t" + ar.toString() + ",\n");
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

}
