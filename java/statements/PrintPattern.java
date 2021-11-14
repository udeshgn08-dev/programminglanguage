
/*************************************************
* Program print a pattern of HelloWorld in V shape 
* Compilation: PrintPattern.java 
* Execution: java PrintPattern "Hello World" "HelloWorld" 
* Output: 
*  HelloWorld      HelloWorld 
*   HelloWorld    HelloWorld 
*    HelloWorld  HelloWorld 
*     HelloWorldHelloWorld
**************************************************/
public class PrintPattern {
         // Main method accepts a single argument:an array of elements of type string 
	 public static void main(String[] args) { 
	
		System.out.println(" "); // statement 1 
		System.out.print("   "+args[0] + args[1]); // statement 2
		System.out.println("       "+args[0] + args[1]); // statement 3
		System.out.print("    " +args[0] + args[1]); // statement 4
		System.out.println("     " +args[0] + args[1]); // statement 5
		System.out.print(    "     " +args[0] + args[1]); // statement 6
		System.out.println("   " +args[0] + args[1]); // statement 7
		System.out.print("      "+args[0]+args[1]); // statement 8
		System.out.println("" +args[0]+args[1]); // statement 9
		System.out.println(" "); // statement 10		
	}
}
