package MDA;
import java.util.Scanner;
public class pro1 {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		int size1=4;
		int size2=4;
		int [][] arr=new int[size1][size2];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
	}
}

