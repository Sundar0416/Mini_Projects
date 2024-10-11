package sri;
import java.util.Stack;
public class stack1 {
	public static void main(String args[]) {
		Stack<String>stack=new Stack<>();
		//System.out.println(stack.empty());
		stack.push("hello");
		stack.push("hi");
		//stack.pop();
		//stack.pop();
		String myfav=stack.pop();
		System.out.println(stack.empty());
		System.out.println(myfav);
		System.out.println(stack);
		
		
		
		
	}

}
