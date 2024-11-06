package pgm;
import java.util.*;
public class RemDup1 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int[]a= {1,2,4,8,6,4,9,6,3,5,9,6,3,2,3,1,6,7};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					a[j]=Integer.MAX_VALUE;
				}
			}
			if(a[i]!=Integer.MAX_VALUE) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]!=Integer.MAX_VALUE) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		int CountUniqueElement=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=Integer.MAX_VALUE) {
				CountUniqueElement++;
			}
		}
		System.out.println(CountUniqueElement);
		
		System.out.println("1.nth largest\n2.nth smallest");
		System.out.print("enter your choice:");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.print("enter n:");
			int n=sc.nextInt();
			if(n>0 && n<=CountUniqueElement) {
				System.out.print(n+" largest number is "+a[a.length-n]);
			}
			else {
				System.out.println("invalid");
			}
		}
		else if(choice==2) {
			System.out.print("enter n:");
			int n=sc.nextInt();
			if(n>0 && n<=CountUniqueElement) {
				System.out.print(n+" smallest number is "+a[n-1]);
			}
			else {
				System.out.println("invalid");
			}
		}
		else {
			System.out.println("invalid");
		}
		
	}
}
