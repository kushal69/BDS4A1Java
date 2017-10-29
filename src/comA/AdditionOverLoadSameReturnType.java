package comA;

//	Main Class with Name AdditionOverLoadSameReturnType
public class AdditionOverLoadSameReturnType {
	//	Method Which takes 2 parameters adds the same and displays in the formated pattern
	public int sum(int firstNumber, int secondNumber){
		System.out.println("First Number is : " + firstNumber);
		System.out.println("Second Number is : " + secondNumber);
		
		return (firstNumber + secondNumber);								// Adding the 2 numbers
	}
	
	//	Method Which takes 3 parameters adds the same and displays in the formated pattern
	public int sum(int firstNumber, int secondNumber, int thirdNumber){
		System.out.println("First Number is : " + firstNumber);
		System.out.println("Second Number is : " + secondNumber);
		System.out.println("Third Number is : " + thirdNumber);
		
		return (firstNumber + secondNumber + thirdNumber);								// Adding the 2 numbers
	}
	
	//	Main method which adds the 2 & 3 numbers and displays the same.
	public static void main(String[] args) {
		AdditionOverLoadSameReturnType additionOverLoadSameReturnType = new AdditionOverLoadSameReturnType();
		
		int firstNumber = 100;		//	Variable One
		int secondNumber = 200;		//	Variable Two
		int thirdNumber = 300;		//	Variable Three
		int sum = 0;
		
		//	Yes we can same return type of the method and overload with different number and type of arguments
		//	Calling Methods
		sum = additionOverLoadSameReturnType.sum(firstNumber, secondNumber);
		System.out.println("Sum -> " + sum);
		
		sum = additionOverLoadSameReturnType.sum(firstNumber, secondNumber, thirdNumber);
		System.out.println("Sum -> " + sum);
	}	
}