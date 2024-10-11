package sundar;

public class pattern12 {
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int space=1;space<=n-i;space++)
			{
				System.out.print(" ");
			}
			for(int j=n;j>=i-1;j--)
			{
				if(i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.print("\n");
			for(int j=1;j<=n;j++)
			{
				
				System.out.print("*");
			}
			
		}
	}

}
