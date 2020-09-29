// Java program to find first 
// and last character of a string 

// Need scanner for capturing input
import java.util.Scanner;
  
// Class for the assignment
public class U2_L3_Activity_One
{ // Beginning of class U2_L3_Activity_One

	// Executed code
	public static void main(String args[]) 
	{ // Beginning of function main()

		/* Write your code here */

		// Making a scanner and the destination for that scanning
		Scanner scan = new Scanner(System.in);
		String a = null;

		// Prompting for input then capturing that input
		System.out.println("Enter a string:");
		a = scan.nextLine();

		// Getting length then getting the first
		// and last (using the length) characters of the string
		int length = a.length();
		char first = a.charAt(0);
		char last  = a.charAt(length-1);

		// Printing the first and last characters of the string

    		// Method 1 using println (use this one)
    		System.out.println(first+""+last);

    		// Method 2 using printf
		// System.out.printf("%c%c", first, last);

	} // End of function main()
 
} // End of class U2_L3_Activity_One