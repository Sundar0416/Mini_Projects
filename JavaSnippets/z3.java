package were;

import java.util.Scanner;

public class z3 {
	public static void main(String[] args) {
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a string:");
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(c[i]>='0' && c[i]<='9') {
				int temp=c[i-1];
				while(c[i]>='0' && c[i]<='9') {
					n=(n*10)+(c[i]-'0');
				    i++;
				}
				for(int j=0;j<n;j++) {
					System.out.print(temp);
				}
			}
		}
	}
	
}