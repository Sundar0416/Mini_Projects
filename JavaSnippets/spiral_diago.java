package palgm;

import java.util.Scanner;

public class spiral_diago {
	public static void main(String[] args) throws Exception{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=2*n-1;
		int rowstart=0,rowend=m-1,columnstart=0,columnend=m-1;
		
		int[][] arr=new int[m][m];
		while(n>0) {
			for(int i=columnstart;i<=columnend;i++) {
				arr[rowstart][i]=n;
			}
			rowstart++;
			for(int i=rowstart;i<=rowend;i++) {
				arr[i][columnend]=n;
			}
			columnend--;
			for(int i=columnend;i>=columnstart;i--) {
				arr[rowend][i]=n;
			}
			rowend--;
			for(int i=rowend;i>=rowstart;i--) {
				arr[i][columnstart]=n;
			}
			columnstart++;
			n--;
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j] + " ");
				Thread.sleep(100);
			}
			System.out.println();
		}
	}

}
