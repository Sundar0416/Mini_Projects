package interview;

public class Arr_tar {
	public static void main(String[] args) {
		int[] A= {1,3,5,6,8};
		int target=7;
		 Arr_tar arrTar = new Arr_tar(); 
	        int resultIndex = arrTar.zoho(A, target); 
	        System.out.print(arrTar.zoho(A, target));
	      
	}
	public int zoho(int[] A,int target) {
		int low=0;
		int high=A.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(A[mid]==target)
				return mid;
			else if(A[mid]>target)
				high=mid-1;
			else
				low=mid+1;
		}
		return low;
	}

}
