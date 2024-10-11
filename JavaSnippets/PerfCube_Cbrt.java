package pgm;

public class PerfCube_Cbrt {
	public static void main(String[] args) {
		int n=64;
		boolean flag=false;
		for(int i=1;i*i*i<=n;i++) {
			if(i*i*i==n) {
				flag=true;
				System.out.println(i+" is a cbrt of "+n);
				break;
			}
		}
		if(flag) {
			System.out.println(n+" is a perfect cube no.");
		}
		else {
			System.out.println(n+" is not a perfect cube no.");
		}
	}
}