package palgm;

public class look_and_say_pat1 {
	public static void main(String[] args) {
		String str="2355429";
		char[] ch=str.toCharArray();
		int count=1;
		char curr=ch[0];
		for(int i=1;i<ch.length;i++) {
			    
				if(curr==ch[i]) {
					count++;
				}
				else {
					System.out.print(count+""+curr);
					curr=ch[i];
					count=1;
			}
			
		}
		System.out.print(count+""+curr);
	}
}