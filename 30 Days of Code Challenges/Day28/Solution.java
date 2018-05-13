import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int returnDay = scan.nextInt();
        int returnMonth = scan.nextInt();
        int returnYear = scan.nextInt();
        int dueDay = scan.nextInt();
        int dueMonth = scan.nextInt();
        int dueYear = scan.nextInt();
        
        int lateMonth = returnMonth - dueMonth;
        int lateDay = returnDay - dueDay;
        int lateYear = returnYear - dueYear;


        System.out.println ((returnYear - dueYear > 0 ) ? 10000 
            : (returnMonth - dueMonth > 0 && lateYear == 0) ? lateMonth * 500
                    : (returnDay - dueDay > 0 && lateYear == 0) ? lateDay * 15 : 0);
        scan.close();
    }
}