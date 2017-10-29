package comA;

import java.util.Scanner;

//	Main Class with Name acadUserInput
public class acadUserInput {
	//	Main method which adds the 2 numbers and displays the same.
	public static void main(String[] args) {
		int firstNumber = 0;		//	Variable One
		int seconNumber = 0;		//	Variable Two
		
		Scanner userInput = new Scanner(System.in);		//	Scanner to take the user input at RunTime
		
		System.out.print("Enter First Number to Add : ");
		firstNumber = userInput.nextInt();
		
		System.out.print("Enter Second Number to Add : ");
		seconNumber = userInput.nextInt();
		
		System.out.println("Sum -> " + (firstNumber + seconNumber));		// Adding the 2 numbers and displaying the same.
		
		userInput.close();						//	Closing the Scanner input to avoid memory leak
	}	
}