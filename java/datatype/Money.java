/**
 * Program to compute Indian coins and rupee 
 * 
 * Notice, the input is the number of coins or rupee, person have. 
 * Example a person might have money note in 5 rupees * 2 
 * Therefore 5 * 2 = 10 INR 
 * 
 * Compilation: javac CountMoney.java 
 * Execution: java CountMoney 10 5 7 6 2 3 5 10 12 
 *
 *  output:
 *  1's  in coins 10 = 10
 *	2's  in coins 5  = 10
 *  5's  in coins 7  = 35
 *  10's in coins 6  = 60 
 *  5's  in note  2  = 10 
 *  10   in note  3  = 30 
 *  20   in note  5  = 100 
 *  50   in note  10 = 500 
 *  100  in note  12 = 1200 
 *  200  in note  2  =  400 
 *  500  in note  2  = 1000
 *  Total amount = 3355 INR  
 */
package ch02.datatype;

public class Money {

	public static void main(String[] args) {

		int computeOne       = 1   * Integer.parseInt(args[0]); // 10
		int computeTwo       = 2   * Integer.parseInt(args[1]); // 10
		int computeFive      = 5   * Integer.parseInt(args[2]); // 35
		int computeTen       = 10  * Integer.parseInt(args[3]); // 60
		int note_in_five     = 5   * Integer.parseInt(args[4]); // 10 
		int note_in_ten      = 10  * Integer.parseInt(args[5]); // 30
		int note_in_twentie  = 20  * Integer.parseInt(args[6]); // 100
		int note_in_fifty    = 50  * Integer.parseInt(args[7]); // 500
		int note_in_hundred  = 100 * Integer.parseInt(args[8]); // 1200
		int note_twoHundred  = 200 * Integer.parseInt(args[9]); // 400
		int note_fiveHundred = 500 * Integer.parseInt(args[10]); // 500
		
		int result = computeOne + computeTwo + computeFive + computeTen;
		
		System.out.println("\t500  in note  "   +  args[10] +  "=" + note_fiveHundred);
		System.out.println("\t200  in note  "   +  args[9] +   "=" + note_twoHundred);
		System.out.println("\t100  in note  "   +  args[8] +   "=" + note_in_hundred);
		System.out.println("\t50   in note  "   +  args[7] +   "=" + note_in_fifty);
		System.out.println("\t20   in note  "   +  args[6] +   "=" + note_in_twentie);
		System.out.println("\t10   in note  "   +  args[5] +   "=" + note_in_ten);
		System.out.println("\t5's  in note  "   +  args[4] +   "=" + note_in_five);
		System.out.println("\t10's in coins "   +  args[3] +   "=" + computeTen);
		System.out.println("\t5's  in coins "   +  args[2] +   "=" + computeFive);
		System.out.println("\t2's  in coins "   +  args[1] +   "=" + computeTwo);
		System.out.println("\t1's  in coins "   +  args[0] +   "=" + computeOne);
		
		int finalResult = result+(note_in_five+note_in_ten+note_in_twentie
				          +note_in_fifty+note_in_hundred+note_twoHundred
				          +note_fiveHundred); 
		
		System.out.println("\tTotal amount = " + finalResult + " INR");
	   
	}

}
