package javaPackage;
import java.util.Scanner;
public class FlagControlledLoop {

	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	/*double sum= 0.0;
	double value;
	boolean positiveinput= true;
	while (positiveinput==true)	
	{
		System.out.println("Enter the Next positive number");
		value = reader.nextDouble();
	if (value<0)
		positiveinput= false;
	
	else 
		sum+=value;	
	}
	System.out.println("Sum of input number is: "+sum);
*/
	
	int guess,rand;
	rand =(int) (Math.random()*100);
	boolean stillplaying = true;
	while (stillplaying)
	{
		System.out.println("Guess a number between 0 and 100");
		guess = reader.nextInt();
		
		if (guess >rand)
			System.out.println("Guess too large");
		else
		if (guess<rand)
			System.out.println("Guess too small");
		else
		{
			System.out.println("You win ! !");
			stillplaying = false;
			
		}


	
		
	}
	
	
}
	

}
