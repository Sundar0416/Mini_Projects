package pgm;

public class deci_bin {
	public static void main(String[] args) {
		int num=19;
		String ans="";
		while(num>0) {
			int pop=num%2;
			ans=pop+ans;
			num=num/2;
		}
		System.out.println(ans);
	}
}