package were;

public class string3 {
	public static void main(String[] args) {
		
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
				if(w.equals("red")) {
					ns=ns+"blue"+" ";
				}
				else {
					ns=ns+w+" ";
				}
				w="";
			}
		}
		System.out.print(ns);
	}

}



}
