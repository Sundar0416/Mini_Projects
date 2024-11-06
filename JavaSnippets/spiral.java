package MDA;
import java.util.Scanner;
public class spiral{
	public static void main(String[] args) {
		
		int[][] arr= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int rowstart=0,rowend=arr.length-1,columnstart=0,columnend=arr.length-1;
		
		
		while(rowstart<=rowend && columnstart<=columnend ) {
			for(int i=columnstart;i<=columnend;i++) {
				System.out.print(arr[rowstart][i]+" ");
			}
			rowstart++;
			for(int i=rowstart;i<=rowend;i++) {
				System.out.print(arr[i][columnend]+" ");
			}
			columnend--;
			for(int i=columnend;i>=columnstart;i--) {
				System.out.print(arr[rowend][i]+" ");
			}
			rowend--;
			for(int i=rowend;i>=rowstart;i--) {
				System.out.print(arr[i][columnstart]+" ");
			}
			columnstart++;
		}
	}
}