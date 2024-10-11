package were;

public class string2 {
	public static void main(String[] args) {
		int count=0;
		String s="a red seed";
		s=s+" ";
		String w="";
		String ns="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c!=' ') {
				w=w+c;
			}
			else {
				if(count++%2==0) {
					ns=ns+w.toUpperCase()+" ";
				}
				else {
					ns=ns+w.toLowerCase()+" ";
				}
				w="";
			}
		}System.out.print(ns);
	}

}
