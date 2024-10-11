package palgm;

public class sec_lar {
	public static void main(String[] args) 
	{
		int[] arr={10,33,20,34,63};
		int max=arr[0];
		int secmax=0;
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				secmax=max;
				max=arr[i];
			}
			else if(secmax<arr[i]){
				secmax=arr[i];
			}
		}
		System.out.print(secmax);
}

}
