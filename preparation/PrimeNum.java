package code;

import java.util.Scanner;

public class PrimeNum {

	static boolean isPrime(int number) {
		// Method must return a result of type boolean
		if (number <= 1) {
			return false;
		}
		if (number == 2) {
			return true;
		}
		if (number % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= Math.sqrt(number); i += 2) {
			if (number % 3 == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter prime number");
		int result = sc.nextInt();
		System.out.println("Is the number prime? " + isPrime(result));
		
	}

}
