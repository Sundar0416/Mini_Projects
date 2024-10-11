package sri;
import java.util.Scanner;
public class array7 {
	public static void main(String[] args) {
		int sum=0;
		System.out.println("enter the size: ");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] arr=new int[size];
		System.out.println("enter the no.s: ");
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("the no.s are: ");
		for(int i=size-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		
	}

}
