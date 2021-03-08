import java.util.Scanner;

public class RecursiveSum {


	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		int d = 345;
		
			System.out.println(sumOfDigits(d));

		
	}

	private static long sumOfDigits(long n) {
		//long r = n % 10;
		//long d = n / 10;
		 return n == 0 ? 0 : (n % 10 + sumOfDigits(n / 10));
		/*if (n == 0) {
			return 0;
		} else {
			return (n % 10 + sumOfDigits(n / 10));
		}*/

	}
}
