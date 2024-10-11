package were;

public class zz3 {
	public static void main(String[] args) {

		String s = "AAABABCCDDEE";
		char[] c = s.toCharArray();

		int[] visitedarr = new int[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (c[i] == c[j]) {
					count++;
					visitedarr[j] = -1;
				}
			}
			if (visitedarr[i] != -1) {
				visitedarr[i] = count;
			}
		}
		for (int i = 0; i < visitedarr.length; i++) {
			if (visitedarr[i] != -1) {
				System.out.print(c[i] + "" + visitedarr[i]);
			}

		}
	}

}
