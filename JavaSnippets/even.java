package sri;

public class even {
	public static void main(String args[]) {
		int n=100;
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
				sum=sum+i;
			
			}
		}
		
		System.out.println("total"+" "+sum);
	}

}
