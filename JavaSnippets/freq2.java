package were;

public class freq2 {
	public static void main(String[] args) {
		String s = "AABBCCC";
		char[] c=s.toCharArray();
		int[] frearr = new int[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (c[i] == c[j]) {
					count++;
					frearr[j] = -1;
				}
			}
			if (frearr[i] != -1) {
				frearr[i] = count;
			}

		}
		for (int i = 0; i < frearr.length; i++) {
			if (frearr[i]!=-1) {
				System.out.print(c[i]   +""+ frearr[i]);
			}
		}

	}

}

