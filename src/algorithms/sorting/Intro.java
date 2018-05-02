package algorithms.sorting;

import java.util.Scanner;

public class Intro {

	static int introTutorial(int V, int[] arr) {
		// Complete this function
		int index = 0;
		for (int i : arr) {
			if (i == V)
				break;
			index++;
		}
		return index;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int V = in.nextInt();
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		int result = introTutorial(V, arr);
		System.out.println(result);
		in.close();
	}
}
