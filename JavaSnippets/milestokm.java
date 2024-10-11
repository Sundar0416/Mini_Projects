package were;
import java.util.Scanner;
public class milestokm {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter in miles :");
		double m=s.nextDouble();
		double km=1.609*m;
		System.out.print("in kilometers "+km);
	}

}
