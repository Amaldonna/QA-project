package javaPackage;
import java.util.Scanner;
public class CalculateArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int length, width, area;
		
		System.out.println ("Enter rectangle length");
		length = input.nextInt();
		System.out.println("Enter rectangle width");
		width = input.nextInt();
		area = length * width;
		System.out.printf("The rectangle area is %d", area);
		
	}

}
