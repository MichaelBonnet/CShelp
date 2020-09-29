// Java program to find first 
// and last character of a string

// Done in September 2020, helping a friend who is a young high schooler
// in advanced CS programs and looking towards the field as a long-term career.
// I don't do too much in Java nowadays, so despite it being fairly low-level stuff,
// it keeps me sharp.

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
