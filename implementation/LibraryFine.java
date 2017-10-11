package implementation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LibraryFine {
  
  private static boolean debugMode = false;

  private static DateFormat df = new SimpleDateFormat("dd MM yyyy");
  
  private static int fee = 15;

  public static int daysBetween(Date d1, Date d2) {
    return (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
  }

  public static int fine(String actualDate, String dueDate) throws ParseException {
    int fine = 0;
    
    if(debugMode) {
      System.out.println("inputs: " + actualDate + " : " + dueDate);
    }
    
    Date actual = df.parse(actualDate);
    Date due = df.parse(dueDate);

    if(debugMode) {
      System.out.println("dates: " + actual + " : " + due);
    }
    
    int days = daysBetween(due, actual);
    
    if(debugMode) 
      System.out.println("Days: " + days);
    
    if(days > 0) fine = days * fee;
    
    return fine;
  }
  
  public static void main(String[] args) throws ParseException {
    Scanner in = new Scanner(System.in);
    System.out.println(fine(in.nextLine(), in.nextLine()));
    in.close();
  }

}
