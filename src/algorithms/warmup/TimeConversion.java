package algorithms.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {

	 /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) throws Exception {
        /*
         * Write your code here.
         */
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
        Date date = parseFormat.parse(s);
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
        return displayFormat.format(date);

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException, Exception {
       // BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        System.out.println(result);
       // bw.newLine();

        scan.close();
    }
}
