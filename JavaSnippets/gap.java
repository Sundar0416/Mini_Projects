package ram;

public class gap {
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int gap=4;
		for(int j=0;j<gap;j++) {
			int sum=0;
			for(int i=j;i<arr.length;i=i+gap) {
				sum=sum+arr[i];
			}
			
			System.out.println(sum);
		}
	}
}