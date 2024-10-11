package were;

import java.util.Scanner;
public class distancebw2pts {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter x2 :");
		double x2=s.nextDouble();
		System.out.println("enter x1 :");
		double x1=s.nextDouble();
		System.out.println("enter y2 :");
		double y2=s.nextDouble();
		System.out.println("enter y1 :");
		double y1=s.nextDouble();
		double d=Math.pow((Math.pow((x2-x1),2)+Math.pow((y2-y1),2)),0.5);
		System.out.println("Distance :"+d);
	}

}
