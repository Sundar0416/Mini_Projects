package sri;
import java.util.Scanner;
public class arrays3 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int numbers[]=new int[5];
		System.out.print("enter the input:");
		for(int i=0;i<5;i++) {
			numbers[i]=s.nextInt();
		}
		System.out.print("output");
		for(int i=0;i<5;i++) {
			System.out.print(numbers[i]);
		}
	}

}
