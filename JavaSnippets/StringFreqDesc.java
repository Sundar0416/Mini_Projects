package palgm;

public class StringFreqDesc {
	public static void main(String[] args) {
		String str="Banana";
		char[] ch=str.toCharArray();
		int[] CountArr=new int[ch.length];
		for(int i=0;i<ch.length;i++) {
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='\0';
				}
			}
			if(ch[i]!='\0') {
				CountArr[i]=count;
			}
		}
		for (int i = 0; i < ch.length - 1; i++) {
            for (int j = 0; j < ch.length - 1 ; j++) {
                if (CountArr[j] < CountArr[j + 1]) { // Sort in descending order
                    // Swap count values
                    int tempCount = CountArr[j];
                    CountArr[j] = CountArr[j + 1];
                    CountArr[j + 1] = tempCount;

                    // Swap characters to keep them aligned with countArr
                    char tempChar = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = tempChar;
                }
            }
        }

        // Display characters and their frequencies in descending order
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '\0') {
                System.out.println(ch[i] + "(" + CountArr[i] + ")");
            }
        }
	}
}