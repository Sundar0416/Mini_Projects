package were;
import java.util.Scanner;
public class z7 {
	  public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
		  System.out.println("enter the size :");
		  int size=s.nextInt();
	      int[] inputArray = new int[size];
	        
	        // Create an array to store frequencies
	      int[] frequencies = new int[100]; // Assuming a maximum value of 100
	        
	        // Count the frequencies
	        for (int num : inputArray) {
	            frequencies[num]++;
	        }

	        // Print the desired output format
	        for (int i = 0; i < frequencies.length; i++) {
	            if (frequencies[i] > 0) {
	                System.out.println(i + "[" + frequencies[i] + "]");
	            }
	        }
	    }
	





}
