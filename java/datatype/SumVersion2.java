/***********************************************************
 * Add zero before integer values and compute result 
 * Compare the program with the first version of Sum program 
 * 
 * Compilation: javac ch02/datatype/SumVersion2.java 
 * Execution: java ch02.datatype.SumVersion2  34 45 
 * 
 * Output: 
 * 567
 * 035
 * 034
 * 045
 * Result 681
 ***********************************************************/
package ch02.datatype;

public class SumVersion2 {

	// Class variable or static field
	static int result;

	public void leadingZero() {
		// local variable
		// Explicit declaration 
		int aValue = 567;
		int bValue = 35;
		result = aValue + bValue;
		// Numeric format
		System.out.println("");
		System.out.format("%d%n", aValue);
		System.out.format("%03d%n", bValue);
	}

	public static void main(String[] args) {
		// Object creation and invoke method
		SumVersion2 obj = new SumVersion2();
		obj.leadingZero();
		// Input while run time of the program 
		int cValue = Integer.parseInt(args[0]);
		int dValue = Integer.parseInt(args[1]);
		// Computation part
		int argsOfResult = cValue + dValue;
		result += argsOfResult;
		// Output
		System.out.printf("%03d%n", cValue);
		System.out.printf("%03d%n", dValue);
		System.out.println("Result " + result);

	}

}
