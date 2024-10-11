package were;

public class alpha {
	
	 public static void main(String[] args)
	 {
      int n=5;
	  int i, j, k;
	  for(i=65; i<=64+n; i++)
	  {
	   for(j=65; j<=64+n; j++)
	   {
	    if(i == j)
	     System.out.format("%c",j);
	    else
	     System.out.print(" ");
	   }
	   for(k=63+n; k>=65; k--)
	   {
	    if(i == k)
	     System.out.format("%c",k);
	    else
	     System.out.print(" ");
	   }
	   System.out.println();
	  }
	 }
	
	 
	


}
