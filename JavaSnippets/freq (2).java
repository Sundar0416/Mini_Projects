package were;
import java.util.Scanner;
public class freq {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size: ");
		int size=s.nextInt();
		System.out.println("enter the values: ");
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int[] visitedarr=new int[arr.length];
		int visited=-1;
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
				System.out.println(arr[i]+"="+visitedarr[i]);
			}
		}
	}
}
