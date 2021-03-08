import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ForLoopII {

	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
        //int t=in.nextInt();
        //for(int i=0;i<t;i++){
            int a = Integer.parseInt(args[0]); //in.nextInt();
            int b = Integer.parseInt(args[1]); //in.nextInt();
            int n = Integer.parseInt(args[2]); //in.nextInt();
            List<Integer> list = new ArrayList<Integer>();
            int sum = a + (((int)Math.pow(2.0,0))*b);
            list.add(sum);
            for (int j=1; j<n; j++) {
                sum += (((int)Math.pow(2.0,j))*b);
                list.add(sum);
            }
            System.out.println(Arrays.toString(list.toArray()).replace(",", "").replace("[", "").replace("]", "").trim());
        //}
        //in.close();

	}

}
