import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int n1 = 0;
		int n2 = 1;
		int nextNumberInFibonacciSeries = 0;
		List<Integer> list = new ArrayList<Integer>();
		getFibonacciSeries(n,list, n1, n2);
		System.out.println(list);

	}

	private static void getFibonacciSeries(int n, List<Integer> list, int n1, int n2, int nextNumberInFibonacciSeries) {
		// TODO Auto-generated method stub
		list.add(n2);
		if(  < n) {
			nextNumberInFibonacciSeries = n1 + n2;
			n1 = n2;
			n2 = nextNumberInFibonacciSeries;
			list.add(nextNumberInFibonacciSeries);
			getFibonacciSeries(n, list, n2, nextNumberInFibonacciSeries);
		}
		
	}*/
	static int fib(int n)
    {
    if (n <= 1)
       return n;
    int fib = fib(n-1) + fib(n-2);
    System.out.println(fib);
return fib;
    }
      
    public static void main (String args[])
    {
    int n = 10;
    System.out.println(fib(n));
    }

}
