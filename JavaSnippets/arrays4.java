package sri;
import java.util.Scanner;
public class arrays4 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the size: ");
		int size=s.nextInt();
		int sum=0;
		int numbers[]= new int[size];
		System.out.print("enter the no.s: ");
		System.out.println();
		for(int i=0;i<size;i++) {
			numbers[i]=s.nextInt();
		}
		for(int i=0;i<size;i++) {
			if(numbers[i]%2==0) {
				System.out.print(numbers[i]);
			sum=sum+numbers[i];}
			System.out.println();
		}System.out.print("sum "+sum);
	}

}
