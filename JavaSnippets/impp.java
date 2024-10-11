package palgm;
import java.util.Scanner;
public class impp {
	public static void main(String[] args) {
		int m=0;
		int n=100;
		for(int i=m+1;i<n;i++) {
			int z=i;
			int temp=i;
			int x=0;
			int y=0;
			while(temp>0) {
				int pop=temp%10;
				x=x+pop;
				temp=temp/10;
			}
			int X=x;
			while(x>0) {
				int pop1=x%10;
				y=y*10+pop1;
				x=x/10;
			}
			if(X*y==z) {
				System.out.println(z);
			}
		}
				
	}
}

/*

*/
