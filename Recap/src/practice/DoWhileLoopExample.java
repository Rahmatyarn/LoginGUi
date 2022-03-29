package practice;

public class DoWhileLoopExample {

	public static void main(String[] args) {
	// Do/while loop is a variant of the while loop. This loop will execute the code block once,
	// before checking if the condition is true, then it will repeat the loop as long as the 
	// condition is true. 
		// the only difference of DoWhileLoop is the flow of execution. 
	// 1. We run the body of the loop
	// 2. we check the condition. It guarantees that we run body of the loop at least once. 
		int x = 0;
		do {
			x++;
			System.out.println("do while" + x);
		} while (x <= 10);

	}

}
