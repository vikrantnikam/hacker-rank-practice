import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        StringBuffer sb = new StringBuffer();
        for(int j=n-1; j >= 0; j--){
            sb.append(String.valueOf(arr[j]) + " ");
            
        }
        System.out.println(sb.toString().trim());
    }
}
