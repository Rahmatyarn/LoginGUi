package practice;

public class Selection {

	public static void main(String[] args) {
		// Selection is the idea of defining a condition and based on that if it is true or false
		// we will get our result. 
		// You put the condition and will tell what will happen if it is true or false
		
		int x = 10;
		int y = 51;
		
	    String z = x > y ? "x is bigger" : "Y is bigger"; //This method is used when we have one condition only
	    System.out.println(z);
		
	    if(x > y) {
	    	System.out.println("X is bigger");
	    }
	    else {
	    	System.out.println("Y is bigger");
	    }
	    
	    double grade = 92;
	    // 90 - 100 - A
	    // 80 - 90 - B
	    // 70 - 80 - C
	    // 70 - 60 - D
	    // <60 - F - Fail
	    
	    if(grade > 90) {
	    	System.out.println("A");
	    }
	    else if (grade > 80) {
	    	System.out.println("B");
	    }
	    else if (grade > 70) {
	    	System.out.println("C");
	    }
	    else if (grade > 60) {
	    	System.out.println("D");
	    }
	    else {
	    	System.out.println("F");
	    }
	}

}
