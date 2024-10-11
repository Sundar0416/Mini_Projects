package sundar;
import java.util.Scanner;
public class pattern10 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a no.:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n+1-i;j++) {
				System.out.print(j + " ");
			}
			for(int j=1;j<i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}


/*
int n=5;
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=n-i+1;j++)
	{
		System.out.print(j);
		System.out.print(" ");
	}
	for(int j=1;j<=i-1;j++)
	{
		System.out.print(j);
		System.out.print(" ");
	
	}System.out.print("\n");
	
}

*/