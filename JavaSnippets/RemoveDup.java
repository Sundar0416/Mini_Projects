package pgm;

public class RemoveDup {
	public static void main(String[] args) {
		int[] arr= {4,5,7,5,4,4};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					arr[j]=Integer.MAX_VALUE;
			}
			if(arr[i]!=Integer.MAX_VALUE)
				System.out.println(arr[i]+" ");
		}
	}
}