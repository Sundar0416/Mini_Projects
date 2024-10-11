package interview;
import java.util.*;
public class diagonal_sum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int[][] arr=new int[n][n];
		int num=n*n;
		int rowstart=0,rowend=n-1,columnstart=0,columnend=n-1;
		while(num>0) {
		for(int i=columnend;i>=columnstart;i--) {
			arr[rowstart][i]=num--;
		}
		rowstart++;
		for(int i=rowstart;i<=rowend;i++) {
			arr[i][columnstart]=num--;
		}
		columnstart++;
		for(int i=columnstart;i<=columnend;i++) {
			arr[rowend][i]=num--;
		}
		rowend--;
		for(int i=rowend;i>=rowstart;i--) {
			arr[i][columnend]=num--;
		}
		columnend--;
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j] + "  ");
				if(i==j||i+j==n-1) {
					sum=sum+arr[i][j];
				}
			}
			System.out.println();

		}
		System.out.print("sum of the diagonals "+sum);
		
	}
}
