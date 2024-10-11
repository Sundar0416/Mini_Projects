package sundar;
import java.util.Scanner;
public class function {
	public static void main(String args[]) {
		
		System.out.println(add());
		System.out.println("the addition operation is executed");
	}
	public static int add() {
		Scanner a= new Scanner(System.in);
		System.out.println("enter a no.:");
		int n=a.nextInt();
		System.out.println("enter a no.:");
		int m=a.nextInt();
		int c=n+m;
		return c;
				
	}

}

