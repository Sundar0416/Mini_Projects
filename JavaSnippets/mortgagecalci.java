package were;
import java.util.Scanner;
public class mortgagecalci {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the principal amount : ");
		double p=s.nextDouble();
		System.out.println("enter the no. of years : ");
		double n=s.nextDouble();
		n=n*12;
		System.out.println("enter the Annual interest : ");
		double a=s.nextDouble();
		double i=a/100/12;
		System.out.println("monthly interest: "+i);
		double monthly_payment=p*i*(Math.pow((i+1), n)/(Math.pow((i+1), n)-1));
		System.out.println("monthly payment is " +monthly_payment);
	}

}
