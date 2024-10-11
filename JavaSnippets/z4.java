package were;
import java.util.Scanner;
public class z4 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter the row and col:");
		int m=s.nextInt();
		int n=s.nextInt();
		int[][] numbers=new int[m][n];
		System.out.println("enter the no.s: ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				numbers[i][j]=s.nextInt();
				}
			}
    	for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
			} 
		int k=0,l=0;
		while(k<m && l<n) {
			for(int i=l;i<n;i++) {
				System.out.print(numbers[k][i]);
			}
			k++;
			for(int i=k;i<m;i++) {
				System.out.print(numbers[i][n-1]);
			}
			n--;
			for(int i=n-1;i>=l;i--) {
				System.out.print(numbers[m-1][i]);
			}
			m--;
			for(int i=m-1;i>=k;i--) {
				System.out.print(numbers[i][l]);
			}
			l++;
		}
	}
}
