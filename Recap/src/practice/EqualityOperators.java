package practice;

public class EqualityOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// == equality operator
		// != Not equal operator
		// The equality operators will work with primitive data types. 
		// In the case of reference data types they will tell you if they are stored at same spot. 
		// We are not using equality operators for strings. 
		// If we want to check the equality of string we use the equals method. 
		// str1.equals(str2) equals method will check each index separately 
		int x = 10;
		int y = 5;
		System.out.println(x != y);
		
		// relational operators
		// <, <=, >=, >
		System.out.println("checking relational operator:" + (x > y));
		
		//Logical Operators
		// And both must be true. Operator for &&
		// Or One must be true.   || Or operator
		// Not. 				  ! Not operator
		// ^ zor operator
		
		System.out.println(true  || false);
		System.out.println(false || false);
		System.out.println(false || true);
		
		System.out.println(true  && true);
		System.out.println(false && true);
		System.out.println(true  && true);
		System.out.println(false && false);
		
		// rule 1: True or anything is true
		// rule 2: False and anything is false
		
		
	}
}
