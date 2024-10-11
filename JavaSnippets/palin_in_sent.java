package palgm;

public class palin_in_sent {

    public static void main(String[] args) {
        String s = "he is a malayalam man of level three ala";
        int n = s.length();
        String word = "";
        String final_word = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                word = word + s.charAt(i);
            } else {
                if (!pal(word)) {
                    final_word = final_word + word + " ";
                }
                word = ""; // Reset word after a space
            }
        }
        // Handle the last word if sentence doesn't end with space
        if (!pal(word)) {
            final_word = final_word + word + " ";
        }

        System.out.println(final_word);
    }

    // Method to check if a word is a palindrome
    public static boolean pal(String word) {
        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i++) != word.charAt(j--)) {
                return false; // Not a palindrome
            }
        }
        return true; // It's a palindrome
    }
}