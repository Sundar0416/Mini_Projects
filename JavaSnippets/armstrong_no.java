package cheek;

public class armstrong_no {
	public static void main(String[] args) {           
		int sum=0;
		int n=153;
		String num=String.valueOf(n);
		int count=num.length();
		while(n>0) {
			int pop=n%10;
			sum=sum + (int)Math.pow(pop, count);
			n=n/10;
		}
		System.out.println(sum);
		if(n==sum) {
			System.out.print("Arms no");
		}
		else{
			System.out.print("Not a Arms no");
		}
		
	}
}
/*
input  -  153
output -  1^3 + 5^3 + 3^3 = 153 
*/