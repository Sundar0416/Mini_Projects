package ram;
import java.util.Scanner;
public class center_num {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the len: ");
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.print("enter x (start no.): ");
		int x=s.nextInt();
		System.out.print("enter y (end no.): ");
		int y=s.nextInt();
		if(x<y) {
			for(int i=0;i<n;i++) {
				if(arr[i]>x && arr[i]<y) {
					System.out.print(arr[i]);
				}
			}
		}
		else {
			System.out.print("condition mismatch");
		}
	}

}
