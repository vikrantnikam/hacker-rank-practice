import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NthPrime {
	private static long limit = 10001;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<Long, Integer> primeNumberSeqMap = new HashMap<Long, Integer>();
		primeNumberSeqMap.put(1L, 2);
		long primeIndex = 2;
		for (int i = 2; i <= limit; i++) {
			if (isPrime(i)) {
				primeNumberSeqMap.put(primeIndex, i);
				primeIndex++;
			}
		}
		int k = primeNumberSeqMap.get(1229L);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			// long n = in.nextLong();
			System.out.println(primeNumberSeqMap.get(n));
		}
		in.close();
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
