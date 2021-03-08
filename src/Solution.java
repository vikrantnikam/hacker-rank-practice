import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

    /*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr) {
        /*
         * Write your code here.
         */
        int size = arr.length;
        int noOfPlus = 0;
        int noOfMinus = 0;
        int noOfZeros = 0;
        for (int a: arr){
            if (a == 0) {
                noOfZeros++;
            } else if (a > 0) {
                noOfPlus++;
            } else {
                noOfMinus++;
            }
        }
        System.out.println((float)noOfPlus/size + "\n" + (float)noOfMinus/size + "\n" + (float)noOfZeros/size + "\n");

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /*int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }
        //int[] arr = new int[] {-4, 3, 9, 0 ,1 -2};
        plusMinus(arr);*/
        //String s = "abc";
    	/*String S = "HelloWorld";
        int start = 2;
        int end = 5;
        int len = S.length();
        if (len <= 1 && len >=100){
            if (start >= 0 && end > start && end <= len) {
                if (S.matches("[a-zA-Z]+")) {
                    System.out.println(S.substring(start, end-1));
                }
            }
        }*/
        //String 	s = "abcdefgpw";
        //String[] strs = s.split("[a-z]", 2);
        //System.out.println(Arrays.toString(s.split("(?<=\\G.{2})")));
        /*for(String str: strs){
        	System.out.println(str);
        }*/
        //System.out.println(sum_of_digit(125));
        
        /*int[] arr = new int[] {2, 3, 4, 4};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        list.remove(1);
        list.add(1, 3);
        Set<Integer> set = (Set) Arrays.stream(arr).boxed().collect(Collectors.toSet());
        System.out.println(set);
        
       System.out.println(list);*/
    	Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int sum=0;
            int n = in.nextInt();
            
            
            for (int i=0;i<n;i++){
                if (i%3==0  || i%5==0) {
                    sum += i;
                }
            }
            System.out.println(sum);
            /*int qoutFive = (n-1)/5;
            
            for (int i=1; i<=qoutFive; i++) {
                sum += 5*i;
            }
            int qoutThree = (n-1)/3;
            for (int j=1; j<=qoutThree; j++) {
                sum += 3*j;
            }
            System.out.println(sum);*/
        }
        
    }
    public static int sum_of_digit(int n)
    {   
        return n == 0 ? 0 : (n % 10 + sum_of_digit(n / 10));
    }
}
