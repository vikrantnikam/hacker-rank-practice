import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day25 {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		long limit = 2000000000;
		Set<Long> primeNumberSet = new HashSet<Long>();
		primeNumberSet.add(2L);
		for (long i = 2; i * i < limit; i++) {
			if (isPrime(i)) {
				primeNumberSet.add(i);
			}
		}
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			long n = in.nextLong();
			// long n = in.nextLong();
			System.out.println(!primeNumberSet.contains(n) ? "Not Prime" : "Prime");
		}
	}

	private static boolean isPrime(long n) {
		if (n % 2 == 0)
			return false;
		for (long i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}