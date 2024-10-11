package sri;
import java.util.Scanner;
public class arrays1 {
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.println("enter a sizes:");
		int size1=s.nextInt();
		int size2=s.nextInt();
		int[][] numbers=new int[size1][size2];
		System.out.println("enter a no.s:");
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				numbers[i][j]=s.nextInt();
				
			}
			
		}
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
			
		}  
		   
	}

}
