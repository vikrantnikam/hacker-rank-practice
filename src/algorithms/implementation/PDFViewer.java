package algorithms.implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PDFViewer {

	// Complete the designerPdfViewer function below.
	static int designerPdfViewer(int[] h, String word) {
		List<Integer> list = new ArrayList<Integer>();
		char[] chars = word.toCharArray();
		for (char c : chars) {
			int index = (int) c - 97;
			list.add(h[index]);
		}
		return Collections.max(list) * list.size();

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int[] h = new int[26];

		String[] hItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 26; i++) {
			int hItem = Integer.parseInt(hItems[i]);
			h[i] = hItem;
		}

		String word = scanner.nextLine();

		int result = designerPdfViewer(h, word);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
