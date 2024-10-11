package were;
import java.util.Scanner;
public class z6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a string: ");
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		for(int i=s.length()-1;i>0;i--) {
			if(c[i]=='a' || c[i]=='e' ||c[i]=='i' ||c[i]=='o' ||c[i]=='u') {
				System.out.print(c[i]+c[i-1]);
			}
		}
	}

}
