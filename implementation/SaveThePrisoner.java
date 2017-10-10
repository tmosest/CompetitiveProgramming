package implementation;

import java.util.Scanner;

public class SaveThePrisoner {

  public static long saveThePrisoner(long noOfprisoner, long noOfSweets, long startId) {
    return (startId + noOfSweets - 1) % noOfprisoner;
  }
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    long t = sc.nextLong();
    for (int i = 0; i < t; i++) {
      long noOfprisoner = sc.nextLong();
      long noOfSweet = sc.nextLong();
      long startId = sc.nextLong();

      long result = saveThePrisoner(noOfprisoner, noOfSweet, startId);//(startId + noOfSweet - 1) % noOfprisoner;

      if (result == 0) {
        System.out.println(noOfprisoner);
      } else {
        System.out.println(result);
      }
    }
    sc.close();
  }

}
