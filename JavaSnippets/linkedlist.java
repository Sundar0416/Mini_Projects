package sri;
import java.util.LinkedList;
public class linkedlist {
	public static void main(String[] args) {
		LinkedList<String>linkedlist=new LinkedList<String>();
		linkedlist.push("hello");       //offer
		linkedlist.push("hell");        //offer
		linkedlist.push("helo");       //offer
		linkedlist.push("hlo");           //offer
		linkedlist.pop();                //poll
		linkedlist.addFirst("he");
		linkedlist.addLast("hee");
		linkedlist.add(4,"he");
		linkedlist.pop();
		linkedlist.remove("hell");
		System.out.print(linkedlist);
		System.out.print(linkedlist.peekFirst()); //Last
	}

}
