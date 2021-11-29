/**************************************
 * Compilation: javac DivisionGame.java
 * Execution: java DivisionGame 
 *
 * Leaves remainder? 2
 * 4%2 No remainders left 
 * Quotient  2.0
 * Leaves remainder? -5 
 * -7%2 Leaves remainder
 * Quotient  -3.5 
 * 
 * @see oracle java
 * @see aakash math
 **************************************/
package ch03.If;

import java.util.Scanner;

public class DivisionGame {

	public static void main(String[] args) {
 
		Scanner userInput = new Scanner(System.in);
		System.out.print("Leaves remainder? ");
		int number = userInput.nextInt();
		// Convert primitive numeric type,where the user input might be 5%2 
		// 5%2 = 2.5 and another scenario -7%2 = -3.5
		double quotient = (double)number / 2; 
		userInput.close(); 
		
        // == is Equality operator and = is assignment operator 
		if (number % 2 == 0) { 
			System.out.print(number);  
			System.out.println("%2 No remainders left");
			System.out.println("Quotient " +quotient);
		} 
		else {
			System.out.print(number);
			System.out.println("%2 Leaves remainder");
			System.out.println("Quotient " +quotient);
		}

	}

}
