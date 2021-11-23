/***********************
 * Sum of two numbers 
 * Compilation: javac ch02/datatype/Sum.java
 * Execution: java ch02.datatype.Sum 500 502
 * Output: 
 * 500
 *  + 
 * 502
 * -----
 * 1002 
 * -----
 ***********************/

// Packages of program
package ch02.datatype;

// Class definition 
public class Sum {
	    // Main method 
  public static void main(String[] args) {
	  
		// Body of the program  
	    int valOne = Integer.parseInt(args[0]);
	    int valTwo = Integer.parseInt(args[1]); 
	    int result =  valOne + valTwo;
	    System.out.println("\t"+valOne); 
	    System.out.println("\t+");
	    System.out.println("\t"+valTwo);
	    System.out.println("\t-----");
	    System.out.println("\t"+result); 
	    System.out.println("\t-----");
	}
} // End of the line 
