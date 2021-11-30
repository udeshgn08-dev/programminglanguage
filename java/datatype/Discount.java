/**************************************************
 * Compilation: javac ch02/datatype/Discount.java
 * Execution: java ch02.datatype.Discount 210.0 5.0  
 * Output: 
 * Market price = 210.0 
 * Discount rate = 5.0
 * Price after discount = 199.5
 *
 * @see oracle java
 * @see cuemath 
 * @see javatutoring
 **************************************************/
package ch02.datatype;

public class Discount {

	public static void main(String[] args) {

		double markedprice, discountPercentage, amountDiscount, compute;
		markedprice = Double.parseDouble(args[0]);
		discountPercentage = Double.parseDouble(args[1]);
		System.out.println("Market price = " + markedprice);
		System.out.println("Discount rate = " + discountPercentage);
		compute = 100 - discountPercentage;
		amountDiscount = (compute * markedprice) / 100;
		System.out.println("Price after discount = " + amountDiscount);

	}

} // End of the line
