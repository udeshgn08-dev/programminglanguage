/*
 * Supply arguments in the runtime of program 
 */
package practise;

public class P2NumericArgs {

	public static void main(String[] args) {
		int argOne;
		double argTwo;
		float argThree;
		if (args.length > 0) {
			try {
				argOne = Integer.parseInt(args[0]);
				System.out.print("Integeral " + argOne + ",");
			} catch (NumberFormatException ne) {
				System.err.println("Number must be integeral");
				System.exit(1);
			}
			try {
				argTwo = Double.parseDouble(args[1]);
				System.out.print("Double " + argTwo + ",");
			} catch (NumberFormatException ae) {
				System.err.println("Number must be double");
				System.exit(1);
			}
			try {
				argThree = Float.parseFloat(args[2]);
				System.out.print("Float " + argThree);
			} catch (NumberFormatException ae) {
				System.err.println("Number must be float");
				System.exit(1);
			}
		}

	}

}