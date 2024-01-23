package javaPackage;
import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		/* int grade = 0, sum=0, counter=1;
		
		Scanner input = new Scanner(System.in);
	while (counter<=6)
	{
		System.out.println("Enter Grade for student no: " +counter);
		 grade = input.nextInt();
		 sum+= grade;
		 counter++;
	}
		//System.out.println("The average of the 6 grades is: " +sum/6);
		*/
     int grade = 0, sum=0, counter=1;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 Grades to get the average or -1 to exit : ");
	while (counter<= 5 && grade!=-1)
	{
		System.out.println("Enter Grade for student no: " +counter);
		 grade = input.nextInt();
		 sum+= grade;
		 counter++;
	}
		System.out.println("The average of the 6 grades is: " +sum/6
				);
		
	}

}
