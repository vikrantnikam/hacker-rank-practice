
public class Solution {
	public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
		Scanner scan = new Scanner(System.in); 
		
        /* Declare second integer, double, and String variables. */
       int a = scan.nextInt();
       double b = scan.nextDouble();
       StringBuffer c = new StringBuffer();
       while(scan.hasNext()){
           c.append(scan.next());
           c.append(" ");
       }    
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+a);
        System.out.println(d+b);
        System.out.println(s.concat(c.toString()).trim());
        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        
	}
}