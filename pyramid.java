/*  student name: Yuriko Uchida
 *  student number: #200448500
 *  due date: November 20th, 2020
 *  course name: Programming Fundamentals (COMP 1030)
 */



import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		// Refresh this scanner class.
		// "in" is used to read the user input.
		Scanner scan = new Scanner(System.in);

		// Ask to enter the number of rows.
		System.out.println("Input the number: ");		
		int data = scan.nextInt();
		
		// Manage the number of columns.
		for (int column = 1; column <= data; column++) {

			// Manage the number of spaces.
			for(int space = 1; space <= (data - column); space++) {
				System.out.print(" ");			
			}

			// Manage the number of "@".
			for(int icon = 1; icon <= column; icon++) {
				System.out.print("@");
			}
			
			// Create a new line and go back to for() function handling the number of columns again.
			System.out.println("");
		}    
				
		scan.close();// End the input.
	}//The end of the main class
}//The end of the class