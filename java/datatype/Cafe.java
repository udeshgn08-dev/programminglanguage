/************************************************  
 * Compilation: javac ch02/datatype/Cafe.java
 * Execution: java ch02.datatype.Cafe  
 * Output: 
 * Total cost 179.0 INR 
 * Coffee makes a profit of 2.0 INR 
 * Profit % 1.1173184357541899
 * Profit % 1
 * 
 * @see oracle java
 * @see cuemath 
 * @see decimal format 
 ************************************************/
package ch02.datatype;

import java.lang.Math;

public class Cafe {

	public static void main(String[] args) {

		/*
		 * Specify data types for selling price,cost of item. 
		 * Initialize values to the variables
		 */
		double coffee_sugar = 10.0, coffee_no_sugar = 7.0;
		double cost_of_cafe = 8.0;
		double tea_sugar = 10.0, tea_no_sugar = 7.0;
		double bread_toast = 15.0, sandwich = 20.0;
		double orange = 50.0, mixedFruit = 60.0;

		// Computation
		double profit = coffee_sugar - cost_of_cafe; // 10.0 - 8.0 = 2.0 profit

		double cafePrice = coffee_sugar + coffee_no_sugar;
		double teaPrice = tea_sugar + tea_no_sugar;
		double breadPrice = bread_toast + sandwich;
		double juicePrice = orange + mixedFruit;

		// final result
		double totalCost = cafePrice + teaPrice + breadPrice + juicePrice;
		double profitPercentage = (profit / totalCost) * 100.0;

		System.out.println("Totat cost " + totalCost + " INR");
		System.out.println("Coffee makes a profit of " + profit + " INR");
		System.out.println("Profit % " + profitPercentage);
		System.out.println("Profit % " + Math.round(profitPercentage));
		
	}

} // End of the line
