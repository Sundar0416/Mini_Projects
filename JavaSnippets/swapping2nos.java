package were;
import java.util.Scanner;
public class swapping2nos {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the 1st no. :");
		int a=s.nextInt();
		System.out.println("enter the 2nd no. :");
		int b=s.nextInt();
		System.out.println("the no.s before swapping " +a+ "," +b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("the no.s after swapping " +a+ "," +b);
	}

}
