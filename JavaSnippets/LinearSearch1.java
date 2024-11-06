package pgm;

public class LinearSearch1 {
	public static void main(String[] args) {
		int[] arr= {2,4,6,8,7,1};
		int key=4;
		String res=Linsea(arr,key);
		System.out.println(res);
	}
	public static String Linsea(int[] arr,int key) {
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				flag=true;
				return "present";
			}
		}
		return "absent";
	}
}