package palgm;
import java.util.Scanner;
public class largest_sum {
	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		System.out.println("enter the length ");
//		int n=s.nextInt();
//		System.out.println("enter the values ");
//		int[] arr=new int[n];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=s.nextInt();
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]);
//		}
		int[] arr= {5,0,2,0,3,4,0,2,7};
		int sum=0;
		int big=0;
		for(int i=0;i<arr.length-1;i++) {
			sum=arr[i]+arr[i+1];
			if (big<sum) {
				big=sum;
			}
		}
		System.out.println();
		System.out.println("sum "+ big);
		}
}
