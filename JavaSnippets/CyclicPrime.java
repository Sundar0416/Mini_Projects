package pgm;
public class CyclicPrime {
	public static void main(String[]args) {
		String s="1193";
		boolean res=rotate(s);
		if(res)
			System.out.println("cyclicPrime");
		else
			System.out.println("not a cyclicPrime");
	}
	public static boolean rotate(String s) {
		char[] ch=s.toCharArray();
		int n=ch.length;
		for(int i=1;i<=n;i++) {
			char temp=ch[0];
			for(int k=1;k<ch.length;k++) { 
				ch[k-1]=ch[k];
			}
			ch[ch.length-1]= temp;
			String str=new String(ch);
			int num=Integer.valueOf(str);
			boolean res=isPalindrome(num);
			if(!res) {
				return false;
			}
		}
		return true;
	}
	public static boolean isPalindrome(int num) {
		if(num==0||num==1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}