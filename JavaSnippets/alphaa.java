package were;
public class alphaa {
	public static void main(String[] args) {
		int count=1;
		String s="AABBBZZZ";
		for(int i=0;i<s.length()-1;i++) {
		char c=s.charAt(i);
		if((s.charAt(i))==(s.charAt(i+1))) {
			count++;
		}
		if((s.charAt(i))!=(s.charAt(i+1))) {
			System.out.print(s.charAt(i)+""+""+count);;
		}
	}

}}

