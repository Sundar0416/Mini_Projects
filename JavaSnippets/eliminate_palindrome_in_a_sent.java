package interview1;

public class eliminate_palindrome_in_a_sent {
	


		
	public static boolean isPalindrome(String str) 
    {
        int i = 0, j = str.length() - 1;
         
        // traversing from both the ends
        while (i < j)
        {
            // not palindrome
            if (str.charAt(i++) != str.charAt(j--))
            return false;
        }
        
        return true;
    }
     
    
    public static String removePalinWords(String str) 
    {
     
        String final_str = "", word = "";
         
        
        str = str + " ";
        int n = str.length();
         
        
        for (int i = 0; i < n; i++) 
        {
         
            // accumulating characters of the current word
            if (str.charAt(i) != ' ')
            word = word + str.charAt(i);
         
            else
            {
         
                // if 'word' is not palindrome then a
                // add it to 'final_str'
                if (!(isPalindrome(word)))
                    final_str +=  word + " ";
             
                // reset
                word = "";
            }
        }
         
        // required final string
        return final_str;
   
    }
    
    public static void main (String[] args)
    {
        String str = "Text contains malayalam and level words";
    System.out.print(removePalinWords(str));
    }
}

