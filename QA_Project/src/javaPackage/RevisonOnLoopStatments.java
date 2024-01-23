package javaPackage;
import java.util.Scanner;
public class RevisonOnLoopStatments {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		char passClass;
		double bagWeight;
		double excessWeight= 0;
		double charge= -1;
		int numberOfPassengers, numberofgroups;
		
		System.out.println("Please enter number of Groups");
		numberofgroups=input.nextInt();
		for (int groupcounter=1; groupcounter<=numberofgroups; groupcounter++)
		{
		System.out.println("Please enter number of passengersfor group No: "+ groupcounter);
		numberOfPassengers= input.nextInt();
		
		for(int counter=1; counter<=numberOfPassengers;counter++ )
		{
		System.out.println("Please enter passenger's class For passenger No: " +counter);
        passClass=input.next().charAt(0);
		System.out.println("Please enter the bag weight");
        bagWeight=input.nextDouble();
       
        switch (passClass)
        { 
        case 'f':
        case 'F':
        	if (bagWeight>=30)
        	{
        		excessWeight=bagWeight-30;
        		charge= excessWeight*10;			
        	}
        break;
        
        case 'b':
        case 'B':
        	if (bagWeight>=25)
        	{
        		excessWeight=bagWeight-25;
        		charge= excessWeight*10;
        }
        	break;
        	
        case'e':
        case 'E':
        	if (bagWeight>=20)
        	{
        		excessWeight=bagWeight-20;
        		charge= excessWeight*10;
	}
        	break;
        	
        	default : 
        	System.out.println("You Enterd Invalid info ");

        }
		System.out.println("You have extra charge :" +charge);
		}
	}
	}
        }

