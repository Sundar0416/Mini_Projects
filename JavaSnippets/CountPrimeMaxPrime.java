package pgm;

public class CountPrimeMaxPrime {
	public static void main(String[] args) {
		int[] arr= {10,16,6,8};
		
		
		int max=0;
		for(int i=0;i<arr.length;i++) {
			int n=arr[i];
			int count=0;
			for(int j=2;j<=n;j++) {
				if(isprime(j)) {
					count++;
					max=j;
				}
			}
			System.out.print(count+":"+max+" ");
	
		}
		
	}
	public static boolean isprime(int j) {
		for(int i=2;i<j;i++) {
			if(j%i==0) {
				return false;
			}
		}
		return true;
	}
}
