package comA;

import java.util.Scanner;

//	Main Class with Name FirstTenMultiplesOfNumber
public class FirstTenMultiplesOfNumber {
	
	//	Method Which prints multiples of a number
	public void printMultiples(int firstNumber){
		for(int i=1; i<=10; i++){
			System.out.println(firstNumber + " * " + i + " = " + (firstNumber*i));
		}
	}
	
	//	Main method which displays takes the input from the user and calls the multiple print method
	public static void main(String[] args) {
		FirstTenMultiplesOfNumber firstTenMultiplesOfNumber = new FirstTenMultiplesOfNumber();
		
		int firstNumber = 0;		//	Variable One
		
		Scanner userInput = new Scanner(System.in);		//	Scanner to take the user input at RunTime
		
		System.out.print("Enter Number : ");
		firstNumber = userInput.nextInt();
		
		firstTenMultiplesOfNumber.printMultiples(firstNumber);
		
		userInput.close();						//	Closing the Scanner input to avoid memory leak
	}	
}