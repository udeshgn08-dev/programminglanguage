/*
 * Given any number, perform four basic math operations: Add, Sub, Mul, Div 
 * Rule: Values accept only as arguments during the runtime of program. 
 */
package practise;

public class P6ArithOperation {

	public static void main(String[] args) {
        try { 
		int valueOne = Integer.parseInt(args[0]);
		int valueTwo = Integer.parseInt(args[1]);
		int add = valueOne + valueTwo;
		int sub = valueOne - valueTwo;
		int mul = valueOne * valueTwo;
		int div = valueOne / valueTwo;
		int mod = valueOne % valueTwo;
		System.out.println("Additive: " + add);
		System.out.println("Subtraction: " + sub);
		System.out.println("Multiplication: " + mul);
		System.out.println("Division: " + div);
		System.out.println("Modulus: " + mod);
        }
        catch(ArithmeticException ae) {
        	ae.printStackTrace();
        	System.err.print("undefined ");
        	System.err.println(ae.getMessage());
        } 

	}

}
