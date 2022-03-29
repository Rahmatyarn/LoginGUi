package practice;

public class WhileLoop {

	public static void main(String[] args) {
		// Loops can execute a block of code as long as a specified condition is reached. 
		// We use loops because they save time, reduce errors, and they make code more readable.
		// While loop is mainly used for event control
		// The while loops through a block of code as long as a specified condition is true;
		// syntax
		/* while (condition) {
		 * code block to be executed
		 */
		// If the condition never becomes false you will not get out the loop
		
		int i = 0;
		while (i <= 5) {
			System.out.println(i++);
		}
		System.out.println();
		
		
		//Break -it will stop the loop and get out of the loop
		//Continue - it will skip the iteration
		int f = 10;
		while (f >= 0) {
			if(f == 5) { // this if condition will not break 
				f--;  //If we don't add this code will stop at 6
				continue;
			}
			System.out.println(f--);
		}
		
		//What is infinite loop: it is a loop that will never stop and will continue to infinite.
		
//		while(true) {
//			System.out.println(f++);
//		}
	}
}
