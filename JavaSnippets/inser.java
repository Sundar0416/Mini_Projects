package were;

public class inser {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 4, 6, 89, 76 };
		for (int i = 0; i < arr.length; i++) {
			for(int j=i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}

		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}

	}
}
