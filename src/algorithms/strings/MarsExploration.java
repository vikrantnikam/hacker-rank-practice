package algorithms.strings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MarsExploration {

	// Complete the marsExploration function below.
	static int marsExploration(String s) {
		int changedChars = 0;
		String sos = "SOS";
		int begin = 0;
		int end = 3;
		for (int i = 0; i < s.length() / 3; i++) {
			String msg = s.substring(begin, end);
			if (!sos.equals(msg)) {
				for (int j = 0; j < msg.length(); j++) {
					if (sos.charAt(j) != msg.charAt(j))
						changedChars++;
				}
			}
			begin += 3;
			end += 3;
		}
		return changedChars;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		int result = marsExploration(s);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
