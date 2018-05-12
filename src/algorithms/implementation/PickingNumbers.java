package algorithms.implementation;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class PickingNumbers {

	static final int LIMIT = 100;

	// Complete the pickingNumbers function below.
	static int pickingNumbers(int[] arr) {

		/*
		 * List<Integer> list = new ArrayList<Integer>(); for(int j = 0; j <
		 * arr.length; j++){ List<Integer> tempList = new ArrayList<Integer>();
		 * tempList.add(arr[j]); for (int i = j+1; i < arr.length; i++){ if
		 * (Math.abs(arr[j] - arr[i]) <= 1) { tempList.add(arr[i]); } }
		 * 
		 * 
		 * if (list.size() < tempList.size()) { if (list.size() > 0) {
		 * list.removeAll(list); } list.addAll(tempList); } } return
		 * list.size();
		 */
		int[] counts = new int[LIMIT];
		for (int number : arr) {
			counts[number]++;
		}

		int result = Arrays.stream(counts).max().getAsInt();
		for (int i = 0; i + 1 < counts.length; i++) {
			result = Math.max(result, counts[i] + counts[i + 1]);
		}
		return result;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");
		// scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}

		int result = pickingNumbers(a);
		System.out.println(String.valueOf(result));
		// bufferedWriter.write(String.valueOf(result));
		// bufferedWriter.newLine();

		// bufferedWriter.close();

		scanner.close();
	}
}
