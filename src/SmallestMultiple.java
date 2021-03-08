
import java.util.Scanner;

public class SmallestMultiple {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int a = 1;
			int lcm = 1;
			while (a <= n) {
				lcm = lcm(lcm, a);
				a++;
			}
			System.out.println(lcm);
		}
		in.close();
	}

	public static int lcm(int a, int b) {
		int lcm = (a * b) / gcd(a, b);
		return lcm;
	}

	public static int gcd(int a, int b) {
		int temp = 0;
		while (b != 0) {
			temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}