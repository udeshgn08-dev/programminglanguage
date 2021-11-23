/*************************************************
* Alter two names by supplying arguments as input
* Compilation: javac AlterName.java 
* Execution: java AlterName "kuma" "Rammy" 
* Output: 
* Good morning kuma and Rammy.
* Goodbye Rammy and Kuma.
*************************************************/
package ch01.basics;

public class AlterName {

	public static void main(String[] args) {
		System.out.println("Good morning " + args[0] + " and " + args[1] + ".");
		System.out.println("Goodbye " + args[1] + " and " + args[0] + ".");

	}

}
