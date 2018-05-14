package algorithms.implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ViralAdvertising {

	// Complete the viralAdvertising function below.
	static int viralAdvertising(int n) {
		int noOfReciepients = 0;
		int recipients = 5;
		for (int day = 0; day < n; day++) {
			recipients = Math.floorDiv(recipients, 2);
			noOfReciepients += recipients;
			recipients *= 3;
		}
		return noOfReciepients;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int result = viralAdvertising(n);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
