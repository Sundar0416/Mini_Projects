package sundar;



	public class pattern15
	{
		public static void main(String args[]) 
		{
			
			
			for(int i=1;i<=5;i++) 
				{
				for(int space=1;space<=5-i;space++) 
				{
					System.out.print(" ");}
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}	
				System.out.println();
			}
			for(int i=4;i>=1;i--) 
			{
				for(int space=3;space>=i-1;space--) 
				{
					System.out.print(" ");}
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}	
				System.out.println();
			}
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}System.out.println();
			}
			for(int i=1;i<=4;i++)
			{
				for(int j=4;j>=i;j--)
				{
					System.out.print("*");
				}System.out.println();

	}


			}
		}

				
			