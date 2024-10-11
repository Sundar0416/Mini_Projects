package palgm;

public class look_and_say_pat {
	public static void main(String[] args) {
		String str="2355429";                    //op==>121325141219
		char[] ch=new char[str.length()];
		for(int i=0;i<str.length();i++) { 
			ch[i]=str.charAt(i);
		}
		char current_char= ch[0];
		int count=1;
		for(int i=1;i<ch.length;i++) {
			if(current_char==ch[i]) {
				count++;
			}
			else {
				System.out.print(count+""+""+current_char);
				current_char=ch[i];
				count=1;
			}
		}
		System.out.print(count+""+""+current_char);
	}
}