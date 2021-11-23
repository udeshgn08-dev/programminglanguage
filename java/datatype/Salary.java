/*
 * Program to demonstrate static reference and return type method 
 * 
 * Compilation: javac ch02/datatype/Salary.java
 * Execution: java ch02.datatype.Salary  
 * Output: 
 * Name     G.Udeshkumar
 * work_ID  35 
 * Salary   25000
 */
package ch02.datatype;

public class Salary {

	// Class variable is also known as static field.
	// Declared outside the method
	static char initial = 'G';

	public static void displayContent() {
		// Local variables are declared inside the method
		// Destroyed once it is used.
		String name = ".Udeshkumar";
		int work_ID_number = 42;
		System.out.println("Name\t" + initial + name);
		System.out.println("work_ID\t" + work_ID_number);
	}

	public int hisSalary(int pay) {
		return pay;

	}

	public static void main(String[] args) {
		// Invoke method displayContent without relying on objects
		displayContent();
		// Instantiate new salary of a person..invoke method hisSalary 
		Salary obj = new Salary();
		System.out.println("Salary\t" + obj.hisSalary(25000));

	}

}
