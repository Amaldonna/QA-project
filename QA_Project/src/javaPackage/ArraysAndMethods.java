package javaPackage;
import java.util.Scanner;
public class ArraysAndMethods {

	public static void main(String[] args) 
	 {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the size of Array");
		int size;
		size= input.nextInt();
		double []salaries =new double[size];
		//double[] sales = {12.5,14.5,16.9,34.2,12.7};
		for (int i =0; i<salaries.length;i++)
		{
			System.out.println("Enter salaries for employee No: "+ (i+1));
			salaries[i]=input.nextDouble();
		}
		double sum=0;
		for (int i =0; i<salaries.length;i++)
		{
		sum+= salaries[i];
		
		}
		System.out.println("The sum of salaries is: "+sum);
		System.out.println("The average of salaries is: "+sum/ salaries.length);
	}

}	
