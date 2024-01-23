package javaPackage;

import java.util.Scanner;



public class ForLoopStatement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (int j=1;j<=5;j++)
	{
		System.out.println("Enter number to get its factorial");

	    int number = input.nextInt();
	    int factorial = 1;
	    for (int i =1; i<=number; i++)
	{
		factorial = factorial* i;
		
	}
	
	System.out.println("Factorialis "+ factorial);
	
	
	
	}
	
		
		
		
		
		
	}

}
