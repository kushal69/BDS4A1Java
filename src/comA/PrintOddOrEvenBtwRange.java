package comA;

import java.util.Scanner;

//	Main Class with Name PrintOddOrEvenBtwRange
public class PrintOddOrEvenBtwRange {
	
	//	Method Which takes 2 parameters displays Odd Even numbers between the provided range
	public void displayOddEven(int firstNumber, int secondNumber){
		for(int i=firstNumber+1; i<secondNumber; i++){
			if(i % 2 == 0){													//	Logic to distinguish between Even and Odd
				System.out.println("Number - " + i + " EVEN");
			} else {
				System.out.println("Number - " + i + " ODD");
			}
		}
	}
	
	//	Main method which displays even odd numbers between range
	public static void main(String[] args) {
		PrintOddOrEvenBtwRange printOddOrEvenBtwRange = new PrintOddOrEvenBtwRange();
		
		int firstNumber = 0;		//	Variable One
		int secondNumber = 0;		//	Variable Two
		
		Scanner userInput = new Scanner(System.in);		//	Scanner to take the user input at RunTime
		
		System.out.print("Enter First Number : ");
		firstNumber = userInput.nextInt();
		
		System.out.print("Enter Second Number : ");
		secondNumber = userInput.nextInt();
		
		printOddOrEvenBtwRange.displayOddEven(firstNumber, secondNumber);
		
		userInput.close();						//	Closing the Scanner input to avoid memory leak
	}	
}