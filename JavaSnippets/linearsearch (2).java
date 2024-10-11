package were;

public class linearsearch {
	public static void main(String[] args) {
		int[] arr= {1,3,2,4,6,5};
		int key=3;
		int i=0;
		while(i<arr.length) {
			if(key==arr[i]) {
				System.out.print(key + " present in "+i);
				break;
			}
			i++;
			}
			if(i==arr.length) {
				System.out.print("not present");
			
			}
			
			
		}
		
	}



