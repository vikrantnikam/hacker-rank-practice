package algorithms.implementation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HurdleRace {

    static int hurdleRace(int k, int[] height) {
        List<Integer> list = Arrays.stream(height).boxed().collect(Collectors.toList());
        int maxHurdleHeight =  Collections.max(list) - k;
        if (maxHurdleHeight > 0) {
            return maxHurdleHeight;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i = 0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int result = hurdleRace(k, height);
        System.out.println(result);
        in.close();
    }
}
