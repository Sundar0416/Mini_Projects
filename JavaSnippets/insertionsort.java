package sri;

public class insertionsort {
	public static void main(String[] args) {
		StringBuilder sb =new StringBuilder();
		int[] arr= {2,4,30,6,5,7};
		int[] arr1=new int[arr.length];
		for(int i=1;i<arr.length;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					sb.append(arr1[i]);
				}
			}
			System.out.print(sb.toString());
		}//for(int k=0;k<arr.length;k++) {
		//	System.out.print(arr[k]);
		//}
	}

}