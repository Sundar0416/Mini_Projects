package pgm;
import java.util.Scanner;
public class m2 {
	static Scanner sc=new Scanner(System.in);
	public static int add(int a,int b) {
		int res=a+b;
		return res;
	}
	public static int sub(int a,int b) {
		int res=a-b;
		return res;
	}
	public static int mul(int a,int b) {
		int res=a*b;
		return res;
	}
	public static float div(float a,float b) {
		float res=a/b;
		return res;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Calculator");
		boolean flag=true;
		do {
			System.out.println("Select the input");
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.print("Enter a:");
					int a=sc.nextInt();
					System.out.print("Enter b:");
					int b=sc.nextInt();
					int res=add(a,b);
					System.out.println(res);
					break;
				case 2:
					System.out.print("Enter a:");
					a=sc.nextInt();
					System.out.print("Enter b:");
					b=sc.nextInt();
					res=sub(a,b);
					System.out.println(res);
					break;
				case 3:
					System.out.print("Enter a:");
					a=sc.nextInt();
					System.out.print("Enter b:");
					b=sc.nextInt();
					res=mul(a,b);
					System.out.println(res);
					break;
				case 4:
					System.out.print("Enter a:");
					a=sc.nextInt();
					System.out.print("Enter b:");
					b=sc.nextInt();
					float res1=div(a,b);
					System.out.println(res1);
					break;
				case 5:
					System.out.println("Thank you");
					flag=false;
					break;
			}
		}while(flag);
	}

}
