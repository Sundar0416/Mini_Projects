package were;

public class newmis1 {
	public static void main(String[] args) {
		int[] arr = { 3, 6, 9, 15, 21, 18 };
		int n = 21;
		int s1 = 0;
		int s2 = 0;
		for (int i = 0; i <= n; i += 3) {

			s1 = s1 + i;

		}
		System.out.println(s1);

		for (int i = 0; i <= arr.length - 1; i++) {

			s2 = s2 + arr[i];

		}
		System.out.println(s2);
		System.out.println("missingno " + (s1 - s2));
	}

}
