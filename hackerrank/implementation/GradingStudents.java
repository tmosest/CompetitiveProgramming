package hackerrank.implementation;

import java.util.Scanner;

public class GradingStudents {

	static int closestMultipleOfFive(int number) {
		if(number % 5 == 0) return number;
		int multiple = number / 5;
		return (multiple + 1) * 5;
	}
	
	static int determineGrade(int grade) {
		if(grade < 38) 
			return grade;
		int closeOfFive = closestMultipleOfFive(grade);
		if(closeOfFive - grade < 3)
			return closeOfFive;
		return grade;
	}
	
	static int[] solve(int[] grades){
		for(int i = 0; i < grades.length; i++) {
			grades[i] = determineGrade(grades[i]);
		}
		return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
    }

}
