package comA;

import java.util.Arrays;
import java.util.Collections;

//	Main Class with Name SortingArray
public class SortingArray {
	//	Main method which Array Elements in Descending Order
	public static void main(String[] args) {
		Integer arr [] = {1,2,3,4,10,0,100,95,20,1000};		//	Initializing the Array
		
		System.out.println("Array Before Sort : ");
		for(Integer in : arr){
			System.out.print(in + " ");							//	Displaying Array Before Sort
		}
		
		System.out.println();
		Arrays.sort(arr, Collections.reverseOrder());		// 	Sorting the Array
		
		System.out.println("Array After Sort : ");
		for(Integer in : arr){
			System.out.print(in + " ");							//	Displaying Array After Sort
		}
	}	
}