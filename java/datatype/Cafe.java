/************************************************  
 * Compilation: javac ch02/datatype/CafeShop.java
 * Execution: java ch02.datatype.CafeShop  
 * Output: 
 * Total cost 179.0 INR 
 * Coffee makes a profit of 2.0 INR
 * 
 * @see oracle java
 * @see cuemath 
 ************************************************/
package ch02.datatype;

public class Cafe {

	public static void main(String[] args) {

		/* Specify data types for selling price,cost of item.
		 * Initialize values to the variables
		 */
		double coffee_sugar = 10.0, coffee_no_sugar = 7.0;
		double cost_of_cafe = 8.0;  
		double tea_sugar = 10.0, tea_no_sugar = 7.0;
		double bread_toast = 15.0, sandwich = 20.0;
		double orange = 50.0, mixedFruit = 60.0;

		// Computation
		double profit = coffee_sugar - cost_of_cafe ; // 10.0 - 8.0 = 2.0 profit 
		double cafePrice = coffee_sugar + coffee_no_sugar; 
		double teaPrice = tea_sugar + tea_no_sugar;
		double breadPrice = bread_toast + sandwich; 
		double juicePrice = orange + mixedFruit;

		// final result
		double totalCost = cafePrice + teaPrice + breadPrice + juicePrice;
		System.out.println("Totat cost " + totalCost + " INR");
		System.out.println("Coffee makes a profit of " + profit + " INR");

	}

} // End of the line 
