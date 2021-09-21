/*
 * Initialize three numbers. Interchange between two numbers, however third number should be modified
 *  
 */
package practise;

public class P5SwapNumbers {

	public static void main(String[] args) {
		// Implicit creation 
		int firstNumber = 101, secondNumber = 100; 
		final int thirdNumber = 102;
		int temp = firstNumber; 
		firstNumber = secondNumber; 
		secondNumber = temp;  
		System.out.println("Before swapping the numbers: "+temp+ "," +firstNumber+ "," +thirdNumber);
		System.out.println("After swapping the numbers: " +firstNumber+ "," +secondNumber+ "," +thirdNumber);
	}

}
