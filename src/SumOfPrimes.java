import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SumOfPrimes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			// long i = 2;
			long startTime = System.currentTimeMillis();
			boolean[] primeNumbers = new boolean[n + 1];
			Arrays.fill(primeNumbers, true);
			int i = 2;
			// double sum = (n*(n+1)/2)-1;
			// Set<Integer> s = new HashSet<Integer>();
			while (i * i <= n) {
				if (primeNumbers[i]) {
					int j = i * i;
					int k = 1;
					while (j <= n) {
						if (primeNumbers[j]) {
							primeNumbers[j] = false;
							// System.out.println(j);
							// sum -= j;
						}
						j = (i * i) + (k * i);

						k++;

					}

				}
				i++;
			}
			long sum2 = 0;
			for (int m = 2; m < primeNumbers.length; m++) {
				if (primeNumbers[m]) {
					// System.out.println(m);
					sum2 += m;
				}
			}
			// System.out.println(sum);
			System.out.println(sum2);
			System.out.println(System.currentTimeMillis() - startTime);
		}
	}

	
}
