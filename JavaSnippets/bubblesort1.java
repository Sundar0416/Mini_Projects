package sri;

public class bubblesort1 {
	public static void main(String[] args) {
		int[] arr= {40,30,50,20,10};
		
		for(int j=1;j<arr.length;j++) {
		
		for(int i=0;i<arr.length-j;i++) {
		if(arr[i]>arr[i+1]) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		
	}
		

	}
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
		}
}