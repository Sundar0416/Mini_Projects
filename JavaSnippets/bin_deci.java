package pgm;

public class bin_deci {
	public static void main(String[] args) {
		int bin=1011;
		int x=1;
		int sum=0;
		while(bin>0) {
			int pop=bin%10;
			sum=sum+(pop*x);
			x=x*2;
			bin=bin/10;
		}
		System.out.println(sum);
	}
}