package were;

public class newmis3 {
	public static void main(String[] args) {
		int[] arr= {3,10,31,17};
		int n=31,s1=0,s2=0;
		for(int i=3;i<=n;i+=7) {
			s1=s1+i;
		}
		for(int i=0;i<arr.length;i++) {
			s2=s2+arr[i];
		}
		System.out.print(s1-s2);
	}

}




