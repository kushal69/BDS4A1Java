package comA;

import java.util.Scanner;

//	Main Class with Name acadUserInputFormatedOutput
public class acadUserInputFormatedOutput {
	//	Method Which takes 2 parameters adds the same and displays in the formated pattern
	public void sum(int firstNumber, int secondNumber){
		System.out.println("First Number is : " + firstNumber);
		System.out.println("Second Number is : " + secondNumber);
		System.out.println("Sum -> " + (firstNumber + secondNumber));		// Adding the 2 numbers and displaying the same.
	}
	
	//	Main method which adds the 2 numbers and displays the same.
	public static void main(String[] args) {
		acadUserInputFormatedOutput acadUserInputFormatedOutput = new acadUserInputFormatedOutput();
		
		int firstNumber = 0;		//	Variable One
		int secondNumber = 0;		//	Variable Two
		
		Scanner userInput = new Scanner(System.in);		//	Scanner to take the user input at RunTime
		
		System.out.print("Enter First Number to Add : ");
		firstNumber = userInput.nextInt();
		
		System.out.print("Enter Second Number to Add : ");
		secondNumber = userInput.nextInt();
		
		acadUserInputFormatedOutput.sum(firstNumber, secondNumber);
		
		userInput.close();						//	Closing the Scanner input to avoid memory leak
	}	
}