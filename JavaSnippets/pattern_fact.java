package sundar;
import java.util.Scanner;
public class pattern_fact {
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter the value:");
		int n=a.nextInt();
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			
		}System.out.println("factorial :" +fact);
	}

}
