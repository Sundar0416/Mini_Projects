package palgm;
public class deci_to_mixed {
	public static void main(String[] args) {
		double n=6.5;
		System.out.println("output: "+ otMixedFraction(n));
	}
	public static String otMixedFraction(double n) {
		int wholepart=(int) n;
		double fractionalpart=n-wholepart;
		if(fractionalpart==0) {
			return String.valueOf(wholepart);
		}
		int denominator=1;
		System.out.println(Math.floor(fractionalpart));
		while(fractionalpart!=Math.floor(fractionalpart)) {
			fractionalpart*=10;
			denominator*=10;
			System.out.println(Math.floor(fractionalpart));
		}
		int numerator=(int)fractionalpart;
		int gcd=gcd(numerator,denominator);
		numerator/=gcd;
		denominator/=gcd;
		return wholepart+" "+numerator+"/"+denominator;
	}
	public static int gcd(int a,int b) {
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}
}