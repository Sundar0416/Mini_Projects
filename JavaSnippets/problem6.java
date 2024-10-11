package were;
import java.util.Scanner;
public class problem6 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double p,n,r,ci,a;
		System.out.println("enter P value:");
		p=s.nextDouble();
		System.out.println("enter R value:");
		r=s.nextDouble();
		System.out.println("enter N value:");
		n=s.nextDouble();
		a=p*Math.pow((1+(r/100)), n);
		ci=a-p;
		System.out.println("Compound interest: "+ci);
	}

}
