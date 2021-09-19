/*
 * When an application is launched, the runtime system passes the arguments 
 * to the application's main method via an array of strings.  
 */
package practise;

public class Echo {

	public static void main(String[] args) {
		for (String var : args) {
			System.out.println(var);
		}

	}
}