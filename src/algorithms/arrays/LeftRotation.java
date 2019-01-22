package algorithms.arrays;

import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int a[] = new int[n];
		int arr[] = new int[n];
		/*
		 * for(int a_i=0; a_i < n; a_i++){ a[a_i] = in.nextInt(); }
		 */

		for (int i = 0; i < n; i++) {
			if (d > i)
				arr[n - d + i] = a[i];
			else
				arr[i - d] = a[i];
		}

		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}