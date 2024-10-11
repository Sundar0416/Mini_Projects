package palgm;

public class look_and_say_patt {
	public static void main (String[] args) {
		int n = 5; 
		String s = "1";                                //==>op 
		System.out.println(s);                         //  1                      
		for(int i = 1; i < n; i++) {                   //  11                           
			String new_s="";                           //  21
		    char current_char=s.charAt(0);             //  1211                              
		    int count=1;                               //  111221            
			for(int j = 1; j < s.length(); j++) {
				if(s.charAt(j) == s.charAt(j-1)) {
					count++;  
				} else {
					new_s = new_s+""+""+count+""+current_char; 
					current_char = s.charAt(j);  
					count = 1; 
				}
			}
			new_s = new_s+""+""+count+""+current_char; 
			System.out.println(new_s);
			s = new_s;
		}
	}
}
