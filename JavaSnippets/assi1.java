package sri;
import java.util.Scanner;
public class assi1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the no. of subjects");
		int n = sc.nextInt();
		int[] marks = new int[n];
		int sum = 0;
		int highest = marks[1];
		int smallest=marks[1];
		for(int i = 0;i<n;i++) {
			System.out.print("enter mark" +(i+1)+":");
		    marks[i]=sc.nextInt();
			sum += marks[i];
			if(marks[i]>highest) {
				highest = marks[i]; 
				
			}
			if(marks[i]<smallest) {
				smallest=marks[i];
			}
		}
		double average = (double)sum/n;
		System.out.println("The highest mark is " +highest);
		System.out.println("The average mark is " +average);
		System.out.println("The smallest mark is " +smallest);
	}
	
	
	

}
