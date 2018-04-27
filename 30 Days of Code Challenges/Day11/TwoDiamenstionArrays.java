import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		int[][] temp = new int[3][];
		List<Integer> summArray = new ArrayList<Integer>();
		int colStart = 0;
		 for (int colEnd=3;colEnd <=6; colEnd++) {
			int rowStart = 0;
		    for (int rowEnd=3;rowEnd <=6; rowEnd++) {
				int tempIndex = 0;
				for (int i = colStart; i < colEnd; i++) {
					temp[tempIndex] = Arrays.copyOfRange(arr[i], rowStart, rowEnd);
					tempIndex++;
				}
				temp[1][0]=0;
				temp[1][2]=0;
				int sum = 0;
				for (int j=0; j <3; j++) {
					for (int k=0; k <3; k++) {
						sum += temp[j][k];
					}
				}
				summArray.add(sum);
				rowStart++;
			}
			colStart++;
		}
		System.out.println(Collections.max(summArray));
	}
}
