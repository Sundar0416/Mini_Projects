package sri;
import java.util.Scanner;
public class z2e {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the String: ");
		String s=sc.nextLine();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				for(int j=0;j<s.charAt(i)-48;j++) {
					System.out.print(s.charAt(i-1));
				}
			}
		}
		
	}

}
