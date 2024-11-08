package pgm;

public class Pangram {
	public static void main(String[] args) {
		String s="The Quick brown fox jumps over the lazy dog";
		s=s.toLowerCase();
		boolean[] b=new boolean[26];
		char[] ch= s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ') {
				int index=ch[i]-97;
				b[index]=true;
			}
		}
		boolean flag=true;
		for(int i=0;i<b.length;i++) {
			if(!b[i]) {
				flag=false;
				break;
			}
		}
		if(!flag) {
			System.out.println("not a pan");
		}
		else {
			System.out.println("pan");
		}
	
	}
}