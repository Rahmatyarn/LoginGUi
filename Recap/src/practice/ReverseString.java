package practice;

public class ReverseString {

	public static void main(String[] args) {
		//Reverse the below string
//		String name = "Naqibullah Rahmatyar is studying Java";
//		
//		for (int i = name.length()-1; i >= 0; i--) {
//			System.out.print(name.charAt(i));
//		}
//		System.out.println();
		
		// Reverse it on it's own position
		String job = "Naqib will get a job soon inshallah";
		
		String[] split = job.split(" ");
		String revWord = "";
		String revjob = "";
		
		for (int i = 0; i < split.length; i++) {
			revWord="";
			for (int j = split[i].length()-1; j >=0; j--) {
				revWord = revWord + split[i].charAt(j);
			}
			revjob=revjob+revWord+" ";
			}
		System.out.println(revjob);
		
		
		//Replace the words in string
//		String name = "Do you like coding";
//		String [] split = name.split(" ");
//		String revWord = "";
//		String revName = "";
//		
//		for (int i = split.length-1; i >= 0; i--) {
//			revWord = revWord + split[i] + " ";
//		}
//			revName = revName + revWord +" ";
//		System.out.println(revName);
//	}
//
	}}
