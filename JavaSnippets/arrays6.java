package sri;
import java.util.Scanner;
public class arrays6 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the size:");
		System.out.println();
		int size=s.nextInt();
		int[] arr=new int[size];
		System.out.print("enter the no.s:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			  System.out.println(arr[i]);
		}
	}

}
