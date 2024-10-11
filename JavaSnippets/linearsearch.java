package sri;
import java.util.Scanner;
public class linearsearch {
	public static void main(String[] args) {
		int i=0;
		int[] arr=new int[5];                               //int[] arr={10,27,93,77,65}
		Scanner numbers=new Scanner(System.in);
		System.out.print("enter the values");
		for(int j=0;j<arr.length;j++) {
			
			arr[j]=numbers.nextInt();
		}
	
		Scanner a=new Scanner(System.in);
		System.out.print("enter the key");
		int k=a.nextInt();
		while(i<arr.length) {
			if(k==arr[i]) {
		        System.out.print("key is present and " +i+ " is the index");
				break;
			}
		    i=i+1;
			
			if( i==arr.length){
				System.out.print("key is not present");
			}
		}
	}
}

