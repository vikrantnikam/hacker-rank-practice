import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TriangularNumber {

	public static void main(String[] args) {
		Map<Integer, Integer> numIndexToFactorsMap = new HashMap<Integer, Integer>();
		int triangleNum = 0;
		for (int i = 1; i <= 1000; i++) {
			triangleNum = triangleNum + i;
			int numberOfFactors = getFactors(triangleNum).size();
				if (!numIndexToFactorsMap.containsKey(numberOfFactors)) {
					numIndexToFactorsMap.put(numberOfFactors, triangleNum);
				}
		}

		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		for (int t = 0; t < testCases; t++) {
			int n = in.nextInt();
			
			System.out.println(numIndexToFactorsMap.get(numIndexToFactorsMap.keySet().stream().filter(k -> k>n).sorted().limit(1).collect(Collectors.toList()).get(0)));

		}
		in.close();
	}

	private static List<Integer> getFactors(int n) {
		List<Integer> factorList = new ArrayList<Integer>();
		/*
		 * factorList.add(1); if(n==1) return factorList; factorList.add(n); int
		 * cnt = 1; while (n%2==0) { factorList.add(2*cnt); cnt++; n = n/2; }
		 * factorList.add(n);
		 */
		for (int j = 1; j <= n; j++) {
			if (n % j == 0) {
				factorList.add(j);
			}
		}
		return factorList;
	}
}
