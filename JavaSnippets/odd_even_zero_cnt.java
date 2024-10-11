package pgm;

public class odd_even_zero_cnt {
	public static void main(String[] args) 
	{
		int n=835014812;
		int odd_count=0;
		int even_count=0;
		int zero_count=0;
		while(n>0)
		{
			int pop=n%10;
			if(pop%2!=0)
			{
				odd_count++;
			}
			else if(pop%2==0 && pop!=0)
			{
				even_count++;
			}
			else if(pop==0)
			{
				zero_count++;
			}
			else
			{
				System.out.println("invalid");
			}
			n=n/10;
		}
		System.out.println("Odd : "+odd_count);
		System.out.println("Even : "+even_count);
		System.out.println("Zeros : "+zero_count);
		
	}

}
