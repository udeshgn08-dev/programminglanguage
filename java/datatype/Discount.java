/************************************************  
 * Compilation: javac ch02/datatype/CafeShop.java
 * Execution: java ch02.datatype.CafeShop  
 * Output: 
 * Total cost 179.0 INR 
 * Coffee makes a profit of 2.0 INR
 *
 * @see oracle java
 * @see cuemath 
 * @see javatutoring
 ************************************************/
package ch02.datatype;

public class Discount {

	public static void main(String[] args) {

		double markedprice, discountPercentage, amountDiscount, compute;
		markedprice = Double.parseDouble(args[0]);
		discountPercentage = Double.parseDouble(args[1]);
		System.out.println("Markedprice = " + markedprice);
		System.out.println("Discount rate = " + discountPercentage);
		compute = 100 - discountPercentage;
		amountDiscount = (compute * markedprice) / 100;
		System.out.println("Price after discount = " + amountDiscount);

	}

} // End of the line
