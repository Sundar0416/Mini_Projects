package sri;

public class arrays5 {
	public static void main(String args[]) {
		String s="appa";
		char[] c=s.toCharArray();
		for(int i=0;i<=s.length();i++) {
			c[i]=(char)(c[i]-32);
		}
		s=new String(c);
		System.out.print(s);
	}

}
