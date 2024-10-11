package were;

public class newcount {
	public static void main(String[] args) {
		int[] arr= {2,3,2,1,5,5,1};
		int count=1;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count=count+1;
				}
				
			}
			if(count>1) {
				System.out.print(arr[i]+""+"["+count+"]");
			}
		}
	}
}



