package pgm;
import java.util.Scanner;
public class m1 {
	static Scanner sc=new Scanner(System.in);
	public static int largestOfTwo(int a,int b) {
		if(a>b)
			return a;
		return b;
	}
	public static int smallestOfTwo(int a,int b) {
		if(a<b)
			return a;
		return b;
	}
	public static void main(String[] args) {
		boolean flag=true;
		do {
			System.out.println("welcome to app1");
			System.out.println("select the input");
			System.out.println("1.Largest of two\n2.Smallest of two\n3.Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.print("Enter a : ");
					int a=sc.nextInt();
					System.out.print("Enter b : ");
					int b=sc.nextInt();
					int res=largestOfTwo(a,b);
					System.out.println("Largest : "+res);
					break;
				case 2:
					System.out.print("Enter a : ");
					a=sc.nextInt();
					System.out.print("Enter b : ");
					b=sc.nextInt();
					res=smallestOfTwo(a,b);
					System.out.println("Largest : "+res);
					break;
				case 3:
					System.out.println("Thank you");
					flag=false;
			}
		}while(flag);
	}

}
