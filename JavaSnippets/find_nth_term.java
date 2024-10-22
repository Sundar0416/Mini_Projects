package palgm;
import java.util.*;
public class find_nth_term {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		int cons1=3;
		int cons2=7;
		int no1=0;
		int no2=0;
		int temp1=0;
		int temp2=0;
		int index=0;
		no1=(temp1*10)+cons1;
		al.add(no1);
		no2=(temp1*10)+cons2;
		al.add(no2);
		while(true) {
			for(int i=1;i<=2;i++) {
				if(i==1) {
					temp1=al.get(index++);
					no1=(temp1*10)+cons1;
					al.add(no1);
					no2=(temp1*10)+cons2;
					al.add(no2);
				}
				else {
					temp2=al.get(index++);
					no1=(temp2*10)+cons1;
					al.add(no1);
					no2=(temp2*10)+cons2;
					al.add(no2);
				}
			}
			if(al.size()>100) {
				break;
			}
		}
		System.out.println(al);
		System.out.print("enter a index value:");
		int n=sc.nextInt();
		System.out.print(al.get(n-1));
	}
}