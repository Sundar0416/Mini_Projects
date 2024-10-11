package were;

public class bubb {
	public static void main(String[] args) {
		int arr[]= {1,2,4,3,5,6,4,7};
		int j=1;
		while(j<arr.length) {
			int i=0;
			while(i<arr.length-j) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
				i++;
				
			}
			j++;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}


}}