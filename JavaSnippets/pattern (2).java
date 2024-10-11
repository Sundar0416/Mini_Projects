package palgm;

public class pattern {
	public static void main(String[] args) throws Exception {
		int n=5;
		int m=(n+1)/2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j) {
					if(i<m) {
						System.out.print(n+1-i);
						Thread.sleep(2000);
					}
					else {
						System.out.print(i);
						Thread.sleep(2000);
					}
				}
				else if(i+j==n+1) {
					if(i<m) {
						System.out.print(i);
						Thread.sleep(2000);
					}
					else {
						System.out.print(j);
						Thread.sleep(2000);
					}
				}
				else {
					System.out.print(" ");
					
				}
			}
			System.out.println();
			
		}
	}

}