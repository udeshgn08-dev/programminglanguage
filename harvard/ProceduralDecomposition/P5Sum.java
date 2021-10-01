/*
 * Access/Manipulate static variables and other static methods that don't depend on object 
 */
package set01;

public class P5Sum {

	public static void methodSum() {
		double valueOne = 350000000D;
		double valueTwo = 38.6;
		System.out.println("Result:"+(valueOne + valueTwo));
	}

	public static void main(String[] args) {

		methodSum();

	}

}
