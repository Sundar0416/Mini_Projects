package palgm;

public class lar {
	public static void main(String[] args) 
	{
		int[] arr= {12,32,22,10,58,59,65,60};
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.print(max);

}
}