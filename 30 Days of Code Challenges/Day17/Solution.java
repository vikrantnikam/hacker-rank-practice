import java.util.*;
import java.io.*;

//Write your code here
class Calculator {
    
    public int power(int n, int p) throws NegativeNumberException {
        int ans = 0;
        if (n < 0 || p < 0) {
            throw new NegativeNumberException();
        } else {
            ans = 1;
            while (p != 0){
                ans *= n;
                --p;
            }
        }
        return ans;    
    }
}

class NegativeNumberException extends Exception {
    
    public NegativeNumberException() {
        super();
    }
    
    public String getMessage() {
        return "n and p should be non-negative";
    }
}
class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
