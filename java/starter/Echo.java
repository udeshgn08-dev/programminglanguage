/*************************************************
* Input arguments through console and echo output
*  
* Compilation: javac ch01/basics/Echo.java 
* Execution: java ch01.basics.Echo "Davi" "Age 24" 
* Output: 
* Davi
* Age 24
*************************************************/
package ch01.basics;

public class Echo {

	public static void main(String[] args) {
		
		System.out.println(args[0]);
                System.out.println(args[1]);
	}

}

