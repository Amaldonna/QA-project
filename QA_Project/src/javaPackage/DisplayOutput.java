package javaPackage;
import java.util.Scanner;
public class DisplayOutput 
{

	public static void main(String[] args) {
		
int choise, num1, num2; 
Scanner reader = new Scanner(System.in);
System.out.println("Enter your choice: ");
System.out.println("1. Add tow numbers ");
System.out.println("2. Get the double of a positive number ");
System.out.println("3. Get the square of a number");
choise = reader.nextInt();

switch(choise)
{
case 1 :
	System.out.println("1. Add tow numbers ");
	num1= reader.nextInt();
	num2= reader.nextInt();
	System.out.println(num1+num2);
    break;
case 2 :
	System.out.println("2.Add tow numbers ");
	num1= reader.nextInt();
	num2= reader.nextInt();
	System.out.println(num1-num2);
    break;
case 3 :
	System.out.println("3.Add Positive numbers ");
	num1= reader.nextInt();
	 //num2= reader.nextInt();
	if (num1>0)
	System.out.println(num1* num1);
    break;
default :
	System.out.println("Invalid choise ");
	
}
	
	}
}