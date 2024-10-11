package cheek;
import java.util.Scanner;
public class rotate {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int[][] arr= new int[n][m];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j] +" ");;
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=arr.length-1;j>=0;j--) {
				System.out.print(arr[j][i] +" ");
			}
			System.out.println();
		}
	}
}