package sri;
import java.util.Scanner;
public class fb {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter a no.:");
		int n=a.nextInt();
	//	for(int i=1;i<=n;i++) {
		if(n%3==0) {
			System.out.println("buzz");
		}
		else if(n%5==0) {
			System.out.println("fizz");
		}
		else if(n%3==0&&n%5==0) {
			System.out.println("fizz buzz");
		}
		else{
			System.out.println(n);
			}
		}
	}


