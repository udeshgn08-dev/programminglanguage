/*
 * This programs draws Vertical axis and Horizontal axis 
 */
package com.starter;

public class DrawAxis {
    // Non-static method
    public void method1() {
	System.out.println("X axis refers to the width of a 2 or 3D object");
	System.out.print("Y axis refers to the height of a 2 or 3D object");
    }

    // Static reference
    public static void method2() {
	System.out.print("\n ↑\n |\n |\n Y\n A\n X\n I\n S");
    }

    public static void main(String[] args) {
	DrawAxis obj = new DrawAxis();
	obj.method1();
	method2();
	System.out.println("-----X AXIS----->");
    }
}