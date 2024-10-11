package pgm;

public class strong_num {
	public static void main(String[] args) {
		int n=145;
		int temp=n;
		int fact=1;                  // 1! + 4! + 5! = 145
		int sum=0;
		while(n>0) {
			for(int i=1;i<=n%10;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			fact=1;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println(temp +" : Strong number");
		}
		else {
			System.out.println(temp +" : not a Strong number");
		}
	
	}
}