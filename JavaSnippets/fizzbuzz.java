package sri;
import java.util.Scanner;
public class fizzbuzz {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter a no.:");
		int n=a.nextInt();
	
		if (n%3==0) {
			System.out.println("buzz");
		}
		else if(n%5==0) {
			System.out.println("fizz");
		}
		else if(n%3==0&&n%5==0){
			System.out.println("fizzbuzz");
			
		}
		else {
			System.out.println(n);
			
		}
		
	}

}
