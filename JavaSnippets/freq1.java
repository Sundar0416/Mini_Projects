package were;

public class freq1 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 10, 30, 20, 10, 30 };
		int[] frearr = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					frearr[j] = -1;
				}
			}
			if (frearr[i] != -1) {
				frearr[i] = count;
			}

		}
		for (int i = 0; i < arr.length; i++) {
			if (frearr[i] > 1) {
				System.out.println(arr[i] + "=" + frearr[i]);
			}
		}

	}

}

