/*
 * This programs draws Vertical axis and Horizontal axis 
 */
package com.starter;

public class Axis {
    // Non-static method
    public void method1() {
	System.out.println("X axis refers to the \"WIDTH\" of a 2 or 3D object");
	System.out.print("Y axis refers to the \"HEIGHT\" of a 2 or 3D object");
    }

    // Static reference
    public static void method2() {
	System.out.print("\n ↑\n |\n |\n Y\n A\n X\n I\n S");
    }

    public static void main(String[] args) {
	Axis obj = new Axis();
	obj.method1();
	method2();
	System.out.println("-----X AXIS----->");
    }
}