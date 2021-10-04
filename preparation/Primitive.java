/*
 * Understanding the data of electricity meter 
 * 
 */
package com.javabasics;

public class Primitive {

	public static void main(String[] args) { 
		long meterNumber = 151023000688L; 
		int unit = 140;  
        double price = 6.40D;
        float electricQuantity = 1.08F;
        boolean switchOn = true; 
        System.out.println("Meter Number:" +meterNumber); 
        System.out.println("Total electric power usage: " +unit+ " units");
        System.out.println("Price per unit: " +price); 
	}

}
