import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class MissingNumber {

    /*static int[] missingNumbers(int[] arr, int[] brr) {
        List<Integer> arrlist  = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> brrlist  = Arrays.stream(brr).boxed().collect(Collectors.toList());
        List<Integer> missingNumberList  = new ArrayList<Integer>();
        for (Integer b_val : brrlist) {
            if (!arrlist.contains(b_val) && !missingNumberList.contains(b_val)) {
                missingNumberList.add(b_val);
            } else {
                if (Collections.frequency(brrlist, b_val) > Collections.frequency(arrlist, b_val) && !missingNumberList.contains(b_val) ) {
                    missingNumberList.add(b_val);
                }
            } 
        }
        Collections.sort(missingNumberList);
        return missingNumberList.stream().mapToInt(i -> i).toArray();
        
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] brr = new int[m];
        for(int brr_i = 0; brr_i < m; brr_i++){
            brr[brr_i] = in.nextInt();
        }
        int[] result = missingNumbers(arr, brr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }*/
    
    private static int RADIUS = 100;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] C = new int[2*RADIUS];
        //First list
        int N = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");
        int offset = Integer.parseInt(temp[0]) - RADIUS;
        for(int i = 0; i < N; i++){
            short v = Short.parseShort(temp[i]);
            C[v - offset]--;
        }
        //Second list
        int M = Integer.parseInt(br.readLine());
        temp = br.readLine().split(" ");
        for(int i = 0; i < M; i++){
            short v = Short.parseShort(temp[i]);
            C[v - offset]++;
        }
        //Print
        StringBuffer str = new StringBuffer();
        for(int i = 0; i < C.length; i++){
            if (C[i] != 0){
                str.append((i + offset) + " ");
            }
        }
        System.out.print(str);
}
}
