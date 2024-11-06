package palgm;
public class WordVowelFreq {
	public static void main(String[] args) {
		String s="Hello welcome to Java";
		int wordcount=1;
		int vowelcount=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				wordcount++;
			}
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || 
					s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') {
				vowelcount++;
			}
		}
		System.out.println("wordcount "+wordcount);
		System.out.println("vowelcount "+vowelcount);
		 StringBuffer sb = new StringBuffer(s);

	        // Calculate frequency of each character
	        for (int i = 0; i < sb.length(); i++) {
	            char currentChar = sb.charAt(i);
	            if (currentChar == ' ' || currentChar == '\0') 
	            	continue; // Skip spaces and counted characters

	            int freqcount = 1;
	            for (int j = i + 1; j < sb.length(); j++) {
	                if (sb.charAt(j) == currentChar) {
	                    freqcount++;
	                    sb.setCharAt(j, '\0'); // Mark character as counted
	                }
	            }

	            System.out.println(currentChar + " (" + freqcount + ")");
	        }
	
	}
}