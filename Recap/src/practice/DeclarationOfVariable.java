package practice;

public class DeclarationOfVariable {
	
	public static void main(String[] args) {
		//To declare a variable we need to mention the data type and name of a variable
		//Variable holds a place the memory
		//The variable name is called as Identifier too
		//Declaration - Is the process of defining data type and name of variable. We are reserving
		//a name for variable. 
		//Initialization - Process is assigning a value to a variable. 
		//we can do declaration and initialization at separately or together. but the first time 
		// = this is called assignment operator
		// The first time we assign a value to a variable is called declaration. 
		// 
		
		int x = 10; 	// In here we have declared a variable and initialized a value. 
				// in here we assigned a value to x. which is called assignment. 
		
		System.out.println(x);
		x = 15; 
		System.out.println(x);
// WE have two types of data type in java. 
//		1. Primitive data types
//			byte - 128 to 127
			byte b1 = 127; // we can store up to 127 in byte
//			short
			short s1 = 15;
//			int 
			int i = 4568;
//			long
//			The first 4 will store numbers only
//			
//			float -
			float a = 120.21f;
//			double - 
			double b = 120.00;
			
//			These two can store numbers with decimal points
//			
//			Char - it will store one charactar only. Every charactar has a number in Accii chart
			char c = 'a';
//			boolean - this will store true and false only. 
			boolean d = true;
			
			boolean t = a > b;
			System.out.println(t);
//		2. reference data types. */
			
			//String is reference data type. 
			//All of reference data types will start with upper case. 
			// Please declare a string
			String text = "Hello World"; // The text inside the quotation is called literal value
			String text2 = new String("Testing is fun");
			
			String name = "Naqibullah Rahmatyar";
			System.out.println(name);
		}
	
}
