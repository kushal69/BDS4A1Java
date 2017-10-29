package comA;

//	Main Class with Name AdditionOverLoad
public class AdditionOverLoad {
	//	Method Which takes 2 parameters adds the same and displays in the formated pattern
	public void sum(int firstNumber, int secondNumber){
		System.out.println("First Number is : " + firstNumber);
		System.out.println("Second Number is : " + secondNumber);
		System.out.println("Sum -> " + (firstNumber + secondNumber));		// Adding the 2 numbers and displaying the same.
	}
	
	//	Method Which takes 3 parameters adds the same and displays in the formated pattern
	public void sum(int firstNumber, int secondNumber, int thirdNumber){
		System.out.println("First Number is : " + firstNumber);
		System.out.println("Second Number is : " + secondNumber);
		System.out.println("Third Number is : " + thirdNumber);
		System.out.println("Sum -> " + (firstNumber + secondNumber + thirdNumber));		// Adding the 3 numbers and displaying the same.
	}
	
	//	Main method which adds the 2 & 3 numbers and displays the same.
	public static void main(String[] args) {
		AdditionOverLoad additionOverLoad = new AdditionOverLoad();
		
		int firstNumber = 100;		//	Variable One
		int secondNumber = 200;		//	Variable Two
		int thirdNumber = 300;		//	Variable Three
		
		//	Calling Methods
		additionOverLoad.sum(firstNumber, secondNumber);
		additionOverLoad.sum(firstNumber, secondNumber, thirdNumber);
	}	
}