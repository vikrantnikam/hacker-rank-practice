import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PythoTriples {

	/*
	 * public static void main(String[] args) { Scanner in = new
	 * Scanner(System.in); int t = in.nextInt(); for (int a0 = 0; a0 < t; a0++)
	 * { int n = in.nextInt(); int a = 1; int b = 3; int x = 0; int y = 0; int z
	 * = 0; boolean isPythogorousTriplet = false; while (x + y + z <= n) { x =
	 * b; y = ((a * b) + a); z = (((a * b) + a) + 1); if (x + y + z == n) {
	 * isPythogorousTriplet = true; break; } a++; b = b + 2; } if
	 * (isPythogorousTriplet) { System.out.println(x * y * z); } else {
	 * System.out.println(-1); } } }
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer numberOfTestCases = in.nextInt();
		Map<Long, Long> PythogorousTripletMap = new HashMap<Long, Long>();
		for (int i = 0; i < numberOfTestCases; i++) {
			Long n = in.nextLong();
			if (PythogorousTripletMap.containsKey(n)) {
				System.out.println(PythogorousTripletMap.get(n));
			} else {
				long maxProduct = -1;
				boolean tripletPresent = false;
				for (int a = 3; a <= Math.ceil(n / 3); a++) {
					if ((n*n - 2 * n*a) % (2*n - 2*a) == 0) {
						int b = (int) ((n*n - 2*n*a) / (2*n - 2*a));
						tripletPresent = true;
						int c = (int) (n - (a + b));
						long product = a * b * c;
						if (product > maxProduct)
							maxProduct = product;
					}
				}
				if (tripletPresent) {
					PythogorousTripletMap.put(n, maxProduct);
					System.out.println(maxProduct);
				} else {
					PythogorousTripletMap.put(n, -1L);
					System.out.println(-1);
				}
			}
		}
		in.close();
	}

}
