package were;
import java.util.Scanner;
public class problem7 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char ch;
		System.out.println("enter any character: ");
		ch=s.next().charAt(0);
		int a=ch;
		System.out.print("ASCII value of "+ch+" is "+a);
	}

}
