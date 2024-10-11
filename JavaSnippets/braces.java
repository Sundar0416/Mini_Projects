package interview;

public class braces {
	public static void main(String[] args) {
		char a='{';
		char b='}';
		int count=3;
	for(int i=1;i<=count;i++) {
		for(int j=1;j<=i;j++) {
			for(int k=1;k<=j;k++) {
				System.out.print(a);
			}
			for(int k=1;k<=j;k++) {
				System.out.print(b);
			}
			
			
		}System.out.println();
	}
}
}