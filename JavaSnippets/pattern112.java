package sundar;
import java.util.Scanner;
public class pattern112 {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter a no.:");
	    int n=a.nextInt();
	   
		System.out.println("enter a no.:");
	    int m=a.nextInt();
	    int w=n+m;
	    int x=n-m;
	    int y=n*m;
	    float z=(float)n/(float)m;
	    int v=n%m;
	    
	    System.out.println("sum:"+w);
	    System.out.println("difference:"+x);
	    System.out.println("product:"+y);
	    System.out.println("division:"+z);
	    System.out.println("remainder:"+v);
	}

}
