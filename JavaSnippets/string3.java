package sri;

public class string3 {
	public static void main(String[] args) {
		String rev="";
		String s="amma";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			rev=c+rev;
			
		}
		System.out.print(rev);
		System.out.println();
		if(s.equals(rev)) 
			System.out.print("palindrome");
		else
			System.out.print("not palindrome");
		
	}

}
