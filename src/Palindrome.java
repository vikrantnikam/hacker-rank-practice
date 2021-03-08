import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Palindrome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 100; i < 1000; i++) {
			for (int j = 100000 / i; j < 1000; j++) {
				if (isPalandrome(i * j)) {
					set.add(i * j);
				}
			}
		}

		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();

			List<Integer> palindromeList = set.stream().sorted((val1, val2) -> Integer.compare(val2, val1))
					.filter(val -> val < n).limit(1).collect(Collectors.toList());

			System.out.println(palindromeList.get(0));

		}
		in.close();
		

	}

	private static boolean isPalandrome(int n) {
		int r, sum = 0, temp;
		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		return temp == sum;
	}
}