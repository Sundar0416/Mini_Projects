package were;
import java.util.Scanner;
public class IIdarray {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter row value: ");
		int m=s.nextInt();
		System.out.println("enter col value: ");
		int n=s.nextInt();
		int[][] arr=new int[m][n];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=s.nextInt();
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(i==0||i==arr.length-1||j==0||j==arr[0].length-1)
				    System.out.print(arr[i][j]);
				else
					System.out.print(" ");
			}System.out.println();
			
		}
	}

}
