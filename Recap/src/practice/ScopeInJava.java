package practice;

public class ScopeInJava {


	
	
	public static void max(int a, int b) {
		System.out.println(a > b ? "A is bigger" : "B is bigger");
		//The example above shows how Ternary (?:) works. 		
		// : Colon means otherwise
		//Scope is the area where we can access the variable
		//within the same scope we can not have duplicate variable names
		}
	
	public static void main(String[] args) {
		
		int a = 15;
		int b = 10;
		
		max(a, b);
		}
	
}
