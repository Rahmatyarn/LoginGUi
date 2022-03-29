package practice;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// A multidimensitonal array is an array or arrays. 
		// To create a two-dimensional array, add each array within its own set of curly braces.
		
		// we can declare and array in two formats. 
		// Square brackets and curly praces
		
		
	//	String[] names = {"Jack" , "David" };
		
	//	int[][] numbers = new int[3][3];
		
//		numbers [0][0] = 1;
//		numbers [0][1] = 2;
//		numbers [0][2] = 3;
//		
//		numbers [1][0] = 4;
//		numbers [1][1] = 5;
//		numbers [1][2] = 6;
//		
//		numbers [2][0] = 7;
//		numbers [2][1] = 8;
//		numbers [2][2] = 9;
//		
//		System.out.println(numbers[2][2]);
		
		int[][] numbers = {{0,0,0},{0,0,0},{0,0,0},{0,0,0},{0,0,0}};
		
		numbers[0][0] = 1;
		int x = 1;
		
		for (int i = 0; i < numbers.length; i++) { //In this loop we are running through length or array
			for (int j = 0; j < numbers[i].length;j++) { //In this loop we are referring to each index of array
				numbers[i][j] = x++;
				System.out.print(numbers[i][j] + "\t");
			}
		}
		
		System.out.println();
		
	}

}
