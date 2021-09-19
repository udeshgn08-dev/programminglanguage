package practise;

public class NumericArgs {

	public static void main(String[] args) {
		int argOne;
		double argTwo;
		float argThree;
		if (args.length > 0) {
			try {
				argOne = Integer.parseInt(args[0]);
				System.out.println("Integeral " + argOne);
			} catch (NumberFormatException ne) {
				System.err.println("Whole numbers must be integeral");
				System.exit(1);
			}
			try {
				argTwo = Double.parseDouble(args[1]);
				System.out.println("Double " + argTwo);
			} catch (NumberFormatException ae) {
				System.err.println("Precision point must be double");
				System.exit(1);
			}
			try {
				argThree = Float.parseFloat(args[2]);
				System.out.println("Float " + argThree);
			} catch (NumberFormatException ae) {
				System.err.println("Fractional part must be float");
				System.exit(1);
			}
		}

	}

}
