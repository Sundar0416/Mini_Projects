package sundar;
import java.util.Scanner;
public class pattern130 {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int[] attendance=new int[5];
		int sum=0;
		/*attendance[0]=23;
		attendance[1]=27;
		attendance[2]=38;
		attendance[3]=89;
		attendance[4]=96;*/
		for(int i=0;i<attendance.length;i++) {
			attendance[i]=s.nextInt();
		}
		for(int i=0;i<attendance.length;i++) {
			System.out.println(attendance[i]);
			sum=sum+attendance[i];
		}
		System.out.print(sum);
		
				
	}

}
