package sundar;

public class pattern_prime_no {
	public static void main(String args[]) {
		int n = 10;
		for(int i=2;i<=n;i++) {
			if(n%i!=0) {
				System.out.println("prime");
			}
			else {
				System.out.println("not prime");
			}

		}
	}
}
