package javaPackage;
import java.util.Scanner;

public class GradeSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerical score: ");
        int score = scanner.nextInt();

        char grade = getGrade(score);

        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static char getGrade(int score) {
        // Using a switch statement to determine the grade
        switch (score / 10) {
            case 10:
            case 9:
                return 'A';
            case 8:
                return 'B'; 
            case 7:
                return 'C';
            case 6:
                return 'D';
            default:
                return 'F';
        }
    }

	
	
	
		
		

	}


