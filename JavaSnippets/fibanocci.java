package interview;

public class fibanocci {
	public static void main(String[] args) {
		int f=0;
		int s=1;
		int n=10;
		for(int i=0;i<n;i++) {
			System.out.print(f+" ");
			int t=f+s;
			f=s;
			s=t;
		}
	}
}

