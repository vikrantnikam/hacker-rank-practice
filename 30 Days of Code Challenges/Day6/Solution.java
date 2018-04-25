import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        if (T >=1 && T <=10) {
            for (int i=0 ; i <= T ; i++) {
                String s = scanner.nextLine();
                int len = s.length();
                char[] chars = s.toCharArray();
                if (len>=2 && len <=10000) {
                    StringBuffer even = new StringBuffer();
                    StringBuffer odd = new StringBuffer();
                    for (int j=0 ; j < len; j++) {
                        if (j%2==0) {
                            even.append(chars[j]);
                        } else {
                            odd.append(chars[j]);
                        }
                    }
                    System.out.println(even.toString() + " " + odd.toString());
                }
            }
        }
    }
}