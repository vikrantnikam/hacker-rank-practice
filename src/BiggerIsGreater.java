import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BiggerIsGreater {

	static String biggerIsGreater(String w) {
		String swappedString = "";
		List<String> swappedStrings = new ArrayList<String>();
		swappedStrings.add(w);
		swappedStrings.add(swappedString);
		int k=0;
		if (w.matches("[a-z]+")) {
			char[] chars = w.toCharArray();
			for (int j = 0; j < chars.length; j++) {
				char a = chars[j];
				int firstLetter = (int) chars[j];
				for (int i = j+1; i < chars.length; i++) {
					if ((int)chars[i] > firstLetter ) {
						chars[j] = chars[i];
						chars[i] = a;
						swappedString = String.valueOf(chars);
						swappedStrings.add(swappedString);
						k++;
						
					}
				}
			}
			if (String.valueOf(chars).equals(w)) {
				swappedString = "no answer";
			} else {
				swappedString = String.valueOf(chars);
			}
		}
		Collections.sort(swappedStrings);
		
		return swappedStrings.get(2);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int a0 = 0; a0 < T; a0++) {
			String w = in.next();
			String result = biggerIsGreater(w);
			System.out.println(result);
		}
		in.close();
	}
}