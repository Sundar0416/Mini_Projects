package palgm;
import java.util.Scanner;
public class freq {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size: ");
		int n=s.nextInt();
		
		int[] arr=new int[n];
		int visited=-1;
		int[] visitedarr=new int[n];
		System.out.println("enter the values: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					visitedarr[j]=visited;
				}
			}
			if(visitedarr[i]!=visited) {
				visitedarr[i]=count;
			}
		}
		for(int i=0;i<visitedarr.length;i++) {
			if(visitedarr[i]!=visited) {
				System.out.println(arr[i]+""+"("+visitedarr[i]+")");
			}
		}
	}

}
