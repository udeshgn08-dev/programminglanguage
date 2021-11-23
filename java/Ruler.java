/********************************
* Range of values in Ruler
* 
* Compilation: javac Ruler.java 
* Execution: java Ruler 1 2 1 3 4
* Output: 
*  1 
*  1 2 1 
*  1 2 1 3 1 2 1 
*  1 2 1 3 1 2 1 4 1 2 1 3 1 2 1 
********************************/
package ch01.basics;

public class Ruler {

	public static void main(String[] args) {
		
		System.out.println(args[0]); // Ruler 1 
		System.out.println(args[0] +" "+ args[1] +" "+args[2]); // Ruler 2
		System.out.println(args[0] +" "+ args[1] +" "+args[2]+" "+args[3]+" "+args[0]+" "+args[1]+" "+args[2]); // Ruler 3
		System.out.print(args[0]   +" "+ args[1] +" "+args[2]+" "+args[3]+" "+args[0]+" "+args[1]+" "+args[2]); // Ruler 4
	    System.out.println(" "+args[4] +" "+args[0]+" "+args[1]+" "+args[2]+" "+args[3]+" "+args[0]+" "+args[1]+" "+args[2]);
	    // Ruler 4
	}

}
