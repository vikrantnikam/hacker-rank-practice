package algorithms.implementation;

import static java.util.stream.IntStream.of;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ClimbLeadrboard {

	// Complete the climbingLeaderboard function below.
	static int[] climbingLeaderboard(int[] scores, int[] alice) {
		int[] ranks = new int[alice.length];
		/*
		 * Set<Integer> scoresSet = new HashSet<Integer>(); for(int score :
		 * scores){ scoresSet.add(score); } int i = 0; for(int aliceScore :
		 * alice){ scoresSet.add(aliceScore); List<Integer> slist =
		 * scoresSet.stream().sorted(Comparator.reverseOrder()).collect(
		 * Collectors.toList()); ranks [i] = slist.indexOf(aliceScore)+1; i++; }
		 */
		int[] array = of(scores).distinct().toArray();
		int i = array.length - 1;
		int index = 0;
		for (int score : alice) {
			while (i >= 0) {
				if (score >= array[i]) {
					i--;
				} else {
					ranks[index] = (i + 2);
					break;
				}
			}
			if (i < 0) {
				ranks[index] = 1;
			}
			index++;
		}
		return ranks;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int scoresCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] scores = new int[scoresCount];

		String[] scoresItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < scoresCount; i++) {
			int scoresItem = Integer.parseInt(scoresItems[i]);
			scores[i] = scoresItem;
		}

		int aliceCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] alice = new int[aliceCount];

		String[] aliceItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < aliceCount; i++) {
			int aliceItem = Integer.parseInt(aliceItems[i]);
			alice[i] = aliceItem;
		}

		int[] result = climbingLeaderboard(scores, alice);

		for (int i = 0; i < result.length; i++) {
			bufferedWriter.write(String.valueOf(result[i]));

			if (i != result.length - 1) {
				bufferedWriter.write("\n");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
