/************************
 * Interchange numbers 
 * 
 * Compilation: javac ch02/datatype/SwapNumbers.java
 * Execution: java ch02.datatype.SwapNumbers 
 * Output: 
 *     "Actual input" 35,36,37
 *     "Swap two numbers" 36,35,37
 */
package ch02.datatype;

public class SwapNum {
	// Args variable is the parameter to main method 
	public static void main(String[] args) 
	{
		// Explicit initialization 
		int xVal = 35, yVal = 36; 
		final int Z_VAL = 37; 
		int tempVal = xVal;
		xVal = yVal;
		yVal = tempVal;
		/*
		 * Final modifier. Local variable cannot be assigned 
		 * Z_VAL = 37; 
		 */
		System.out.println("\t\"Actual input\" " + tempVal + "," + xVal + "," + Z_VAL);
		System.out.println("\t\"Swap two numbers\" " + xVal + "," + yVal + "," + Z_VAL);

	}

}
