package sundar;

public class patternA1
{
	public static void main(String args[])
	{
		int fp=20/2;
		int sp=20/2;
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=20;j++)
			{
				if(j==fp || j==sp || i==10/2 && j>fp && j<sp && j%2==0)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.println();
			fp--;
			sp++;
		}
	}
	}
