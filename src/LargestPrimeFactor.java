import java.util.Scanner;

public class LargestPrimeFactor {

	/*
	 * public static void main(String[] args) { Scanner in = new
	 * Scanner(System.in); long startTime = System.currentTimeMillis(); int t =
	 * in.nextInt(); if (t >= 1 && t <= 10) { for (int a0 = 0; a0 < t; a0++) {
	 * long largestPrime = 2; long n = in.nextLong();
	 * 
	 * while(n%2 == 0) { n = n/2; }
	 * 
	 * while(n == long) { n = Math.sqrt(n); }* for (long i = 2; i <= n; i++) {
	 * 
	 * 
	 * if (n%i == 0 && isPrime(i)) { if (i > largestPrime) largestPrime = i; } }
	 * System.out.println(largestPrime == 2 ? n : largestPrime);
	 * 
	 * } } long timeTaken = System.currentTimeMillis() - startTime;
	 * System.out.println("Time taken: " + timeTaken); }
	 * 
	 * private static boolean isPrime(long n) { if (n % 2 == 0) return false;
	 * for (long i = 3; i * i <= n; i += 2) { if (n % i == 0) return false; }
	 * return true; }
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		if (t >= 1 && t <= 10) {
			for (int a0 = 0; a0 < t; a0++) {
				long n = in.nextLong();
				long largestPrime = 2; 
				long i = 2;
				while (i * i <= n) {
					while (n > i && n % i == 0) {
						n = n / i;
					}
					i++;
				}
				/*for (long j = 2; j <= n; j++) {
	                
					if (n%j == 0 && isPrime(j)) {
						if (j > largestPrime)
							largestPrime = j;
					}
				}
			    System.out.println(largestPrime == 2 ? n : largestPrime);*/
				System.out.println(n);

			}
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
