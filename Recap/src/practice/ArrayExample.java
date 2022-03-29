package practice;

public class ArrayExample {

	public static void main(String[] args) {
		// Arrays are used to store multiple values in a single variable, instead 
		// of declaring separate variables for each value.

		// To declare an array, define the variable type with square brackets:
		// To change the value of a specific element, refer to the index number. 
		
		int [] data = new int [5];
		data[0] = 5;
		data[1] = 10;
		data[2] = 15;
		data[3] = 20;
		data[4] = 21;
		
		// You access an array element by referring to the index number. 
		// This statement access the value of 3 element in data. 
		System.out.println(data[2]);
		
		// To find out how many elements an array has, use the length property:
		System.out.println(data.length);
		
		// You can loop through the array elements with the for loop, and use the length
		// property to specify how many times the loop should run. 
//		for (int i = 0; i <= data.length; i++) {
//			System.out.println(data[i]);
//		}
		
		// Loop Through an Array with For-Each
//		for (int i : data) {
//			System.out.println(i);
//		}
		
		
	}

}
