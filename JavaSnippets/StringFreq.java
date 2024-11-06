package palgm;

public class StringFreq {
	public static void main(String[] args) {
		String str="Banana";
		StringBuffer sb=new StringBuffer(str);
		for(int i=0;i<sb.length();i++) {
			char current=sb.charAt(i);
			if(current==' ' || current=='\0') {
				continue;
			}
			int count=1;
			for(int j=i+1;j<sb.length();j++) {
				if(current==sb.charAt(j)) {
					count++;
					sb.setCharAt(j, '\0');
				}
			}
			System.out.println(current+"("+count+")");
			
		}
	}
}