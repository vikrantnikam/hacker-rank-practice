import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static String solve( int year ) {

        if( year == 1918 ) 
            return "26.09.1918";
        if( isLeap( year ) ) 
            return "12.09." + Integer.toString( year );
        else 
            return "13.09." + Integer.toString( year );

    }

    static boolean isLeap( int year ) {
        boolean isLeap = true;
        if( year % 4 != 0 ) 
            isLeap = false;
        if( year > 1918 && year % 100 == 0 && year % 400 != 0 ) 
            isLeap = false;
        return isLeap;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = solve(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
