package hackerrank.implementation;

import java.util.Scanner;

public class DayOfTheProgrammer {

	private static final boolean debugMode = false;
	private static final int dayOfProgrammer = 256;
	
	public static int[] getCountsDaysInMonths(boolean isLeapYear) {
		int[] days = {
				31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
		};
		if(isLeapYear) ++days[1];
		return days;
	}
	
	public static boolean isGregorianLeapYear(int year) {
		return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
	}
	
	public static boolean isJulianLeapYear(int year) {
		return (year % 4 == 0);
	}
	
	public static boolean wasRussiaJulian(int year) {
		return (year <= 1917);
	}
	
	public static String formatDate(int day, int month, int year) {
		StringBuilder sb = new StringBuilder();
		if(day < 10) sb.append("0");
		sb.append(day);
		sb.append(".");
		++month;
		if(month < 10) sb.append("0");
		sb.append(month);
		sb.append(".");
		sb.append(year);
		return sb.toString();
	}
	
	public static String getDayOfProgrammer(int year) {		
		int month = 0;
		int day = 0;
		int daysToCount = dayOfProgrammer;
		
		//Handle weird transition year.
		if(year == 1918) {
			day = 14;
			month = 1;
			daysToCount -= 32;
		}
		
		boolean isLeapYear = wasRussiaJulian(year) ? isJulianLeapYear(year) : isGregorianLeapYear(year);
		int[] monthDayCounts = getCountsDaysInMonths(isLeapYear);
		
		for(int i = 0; i < daysToCount; i++) {
			++day;
			if(day == monthDayCounts[month]) {
				if(debugMode)
					System.out.println("i: " + i + " day: " + day + " month: " + month);
				day = 0;
				++month;
			}
		}
		
		if(debugMode)
			System.out.println("Final day: " + day + " month: " + month);
		return formatDate(day, month, year);
	}
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		in.close();
		String result = getDayOfProgrammer(year);
		System.out.println(result);
	}

}
