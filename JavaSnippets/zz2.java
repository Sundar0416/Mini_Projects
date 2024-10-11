package were;
public class zz2 
{
	public static void main(String[] args) 
	{
		int count=1;
		String s="AAABBCCCCUUYRREESSJJKK";
		char[] c=s.toCharArray();
		for(int i=1;i<s.length();i++) 
		{
				if(c[i]==c[i-1]) 
				{
					count++;
				}
				else
				{
							System.out.print(c[i]+""+""+count);					}
			    }
	}
}





