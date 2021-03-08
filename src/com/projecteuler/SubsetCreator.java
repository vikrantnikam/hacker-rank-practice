package com.projecteuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsetCreator {

	public void subset(int[] A, int k, int start, int currLen, boolean[] used, List<Integer> sumarr) {
		
		if (currLen == k) {
			List<Integer> subarr = new ArrayList<Integer>();
			for (int i = 0; i < A.length; i++) {
				if (used[i] == true) {
					//System.out.print(A[i] + " ");
					subarr.add(A[i]);
				}
			}
			int sum = 0;
			for (Integer val : subarr) {
				sum += val;
			}
			sumarr.add(sum);
			return;
		}
		if (start == A.length) {
			return;
		}
		// For every index we have two options,
		// 1.. Either we select it, means put true in used[] and make currLen+1
		used[start] = true;
		subset(A, k, start + 1, currLen + 1, used,sumarr);
		// 2.. OR we dont select it, means put false in used[] and dont increase
		// currLen
		used[start] = false;
		subset(A, k, start + 1, currLen, used,sumarr);
	}

	public static void main(String[] args) {
		//int A[] = { 1, 2, 3, 4, 5 ,6 };
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			int val = in.nextInt();
			if(val >= 1 && val <=100) {
				A[i] = val;
			}
		}
		boolean[] B = new boolean[A.length];
		SubsetCreator i = new SubsetCreator();
		List<Integer> sumarr = new ArrayList<Integer>();
		i.subset(A, 3, 0, 0, B, sumarr);
		int finalSum = 0;

		for (int cnt = 0; cnt < sumarr.size(); cnt++) {
			if (sumarr.indexOf(sumarr.get(cnt)) == sumarr.lastIndexOf(sumarr.get(cnt))) {
				finalSum += sumarr.get(cnt);
			}
		}
		System.out.println(finalSum);
	}
	/*public static void main(String[] args) {
		
		int[] arr = new int[] {1, 2, 3, 4, 5, 6};
		int n = arr.length;
		int m = 3;
		List<Integer[]> subsetList = new ArrayList<Integer[]>();
		getSubset (arr, n, m, subsetList);
		
		
		

	}

	private static void getSubset(int[] arr, int n, int m, List<Integer[]> subsetList) {
		
		for (int i=0; i < n ; i++) {
			System.out.println(arr[i]);
			for (int j=i+1; j < n ; j++) {
				System.out.println(arr[j]);
				for (int k=j+1; k < n ; k++) {
					System.out.println(arr[k]);
					System.out.println();
				}	
			}
		}
		
		
	}*/

}
