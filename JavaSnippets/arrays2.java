package sri;
import java.util.Scanner;
public class arrays2 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter a size:");
		System.out.println();
		int size=s.nextInt();
		System.out.print("size is "+size);
		System.out.println();
		int numbers[]=new int[size];
		System.out.print("enter the input no.s");
		System.out.println();
		for(int i=0;i<size;i++) {
			numbers[i]=s.nextInt();
		}
		System.out.print("the output no.s are");
		System.out.println();
		for(int i=0;i<size;i++) {
			System.out.print(numbers[i]);
			System.out.println();
		}
	}

}

