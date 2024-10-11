package palgm;

public class water {
	public static void main(String[] args) {
		String s="WATER";
		int n=s.length();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) 
				{
					System.out.print(s.charAt(i)+"  ");
				}
				else if(i+j==n-1) 
				{
					System.out.print(s.charAt(i)+"  ");
				}
				else if(i==n/2)
				{
					System.out.print(s.charAt(j)+"  ");
				}
				else if(j==n/2) {
					System.out.print(s.charAt(i)+"  ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
			
		}
	}

}
