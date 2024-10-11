package pgm;

public class PerfSqr_Sqrt {
	public static void main(String[] args) {
		int n=16;
		boolean flag=false;
		for(int i=1;i*i<=n;i++) {
			if(i*i==n) {
				flag=true;
				System.out.println(i+" is a sqrt of "+n);
				break;
			}
		}
		if(flag) {
			System.out.println(n+" is a  perfect square no.");
		}
		else {
			System.out.println(n+" is not a perfect square no.");
		}
	}
}
