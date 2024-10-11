package sri;
import java.util.Stack;
public class stack2 {
	public static void main(String args[]) {
		Stack<String>stack=new Stack<String>();
		stack.push("mahabharatha");
		stack.push("ramayana");
		stack.push("bhagavat geeta");
		stack.push("kuran");
		stack.pop();
		//String myfav=stack.pop();
	
		//System.out.println(myfav);
	
		System.out.println(stack);
	}

}
