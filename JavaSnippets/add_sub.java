package pgm;
import java.util.Scanner;
public class add_sub {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		boolean flag=true;
		do {
			System.out.println("Select the input");
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n***5.Exit***");
			int choice=sc.nextInt();
			if (choice>=1 && choice<=4) 
			{
				System.out.println("Enter a:");
				int a=sc.nextInt();
				System.out.println("Enter b:");
				int b=sc.nextInt();
				switch(choice) 
				{
					case 1:
						System.out.println(a+b);
						break;
					case 2:
						System.out.println(a-b);
						break;
					case 3:
						System.out.println(a*b);
						break;
					case 4:
						System.out.println((float)a/b);
						break;
				}
			}
			else if(choice==5) {
				System.out.println("Exiting.....");
				flag=false;
			}
			else {
				System.out.println("Invalid selection\nTry once again");
				System.out.println();
				System.out.println();
			}
		}while(flag);
		}
	}
