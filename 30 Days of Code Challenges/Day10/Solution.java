import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        /*StringBuffer sb = new StringBuffer();
        if (n >= 1 && n <= 1000000) {            
            while ( n > 1) {
                sb.append(n%2);
                n = n/2;               
            } 
            sb.append(n%2);
        }
        String binary = sb.reverse().toString();
        int cnt = 0;
        int numberOfOnes = 0;
        for (int i = 0; i < binary.length(); i++){
            char c = binary.charAt(i);        
            if (c == '1') {
                cnt++;
                if(cnt > numberOfOnes)
                    numberOfOnes = cnt;
            } else {
                cnt=0;
            }
        }
        System.out.println(numberOfOnes);*/
        
        int count = 0;
        while (n!=0)
        {
            n = (n & (n << 1)); 
            count++;
        }
        System.out.println(count);
    }
}