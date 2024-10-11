package were;
import java.util.Scanner;
public class unitconversion {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value(in m) : ");
		double m=s.nextDouble();
		double mm=m*Math.pow(10, 3);
		double cm=m*Math.pow(10, 2);
		double km=m*Math.pow(10, -3);
		double mile=km/1609;
		System.out.print("mm :"+mm+  "cm :"+cm+"km :"+km+ "mile :"+mile);
	}

}
