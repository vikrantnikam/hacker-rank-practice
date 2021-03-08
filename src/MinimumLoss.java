import java.util.Scanner;

public class MinimumLoss {

	static int minimumLoss(long[] price) {
		// Complete this function
		/*
		 * Set<Long> set = new HashSet<Long>(); for(long el : price){
		 * set.add(el); } price = set.stream().mapToLong(l -> l).toArray();
		 */
		long minimalLoss = 0;
		for (int i = 0; i < price.length; i++) {
			for (int j = i + 1; j < price.length; j++) {
				long diff = price[i] - price[j];
				if (diff > 0) {
					if (minimalLoss == 0) {
						minimalLoss = diff;
					} else if (diff < minimalLoss) {
						minimalLoss = diff;
					}
				}
			}
		}
		return (int) minimalLoss;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] price = new long[n];
		for (int price_i = 0; price_i < n; price_i++) {
			price[price_i] = in.nextLong();
		}
		int result = minimumLoss(price);
		System.out.println(result);
		in.close();
	}
}
