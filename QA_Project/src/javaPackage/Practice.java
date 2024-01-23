package javaPackage;
import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	
	String fname= "";
	float salary;
	float net_salary;
	System.out.println("Enter you first name");
	 fname = input.next();
	 
	 System.out.println("Enter you salary");
	 salary = input.nextFloat();
	 net_salary = salary - (salary * 0.10f);
	 System.out.printf("your net salary is %f",net_salary);
	}

}
