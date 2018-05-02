package algorithms.warmup;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BirthdayCakeCandles {

	/*
	 * Complete the birthdayCakeCandles function below.
	 */
	static int birthdayCakeCandles(int n, int[] ar) {

		List<Integer> list = Arrays.stream(ar).boxed().collect(Collectors.toList());
		return Collections.frequency(list, Collections.max(list));

	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(scan.nextLine().trim());

		int[] ar = new int[n];

		String[] arItems = scan.nextLine().split(" ");

		for (int arItr = 0; arItr < n; arItr++) {
			int arItem = Integer.parseInt(arItems[arItr].trim());
			ar[arItr] = arItem;
		}

		int result = birthdayCakeCandles(n, ar);

		//bw.write(String.valueOf(result));
		//bw.newLine();

		//bw.close();
		System.out.println(result);
		scan.close();
	}
}
