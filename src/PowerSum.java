import java.util.Scanner;

public class PowerSum {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			long n = in.nextLong();
			long pow = 2L;
			for (int j = 1; j < n; j++) {
				pow = pow * 2;
			}
			System.out.println(sumOfDigits(pow));

		}
	}

	private static long sumOfDigits(long n) {
		return n == 0 ? 0 : (n % 10 + sumOfDigits(n / 10));
	}
}