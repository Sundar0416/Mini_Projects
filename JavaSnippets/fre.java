package were;

public class fre {
	public static void main(String args[]) {
		int count=1;
		String s="aaajjjAAAiiilll";
		char[] c=s.toCharArray();
		for(int i=0;i<s.length()-1;i++) {
			
			if(c[i]==c[i+1]) {
				count++;
			}
			if(c[i]!=c[i+1]) {
				System.out.print(c[i]+""+""+count);
			}
			
		}
	}
}