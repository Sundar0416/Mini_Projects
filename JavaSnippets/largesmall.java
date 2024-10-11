package sri;
import java.util.Scanner;
public class largesmall {
	public static void main(String[] arg) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the no. of subjects: ");
		int n=s.nextInt();
		int[] arr= new int[n];
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			System.out.print("enter the "+(i+1)+ " subject: ");
			arr[i]=s.nextInt();
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(max);

		System.out.print(min);
	}

}
