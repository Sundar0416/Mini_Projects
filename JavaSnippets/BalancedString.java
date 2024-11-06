package palgm;
import java.util.*;
public class BalancedString {
	public static void main(String[] args) {
		Stack <Character> stack=new Stack<>();
		String s="{([])}";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='{' || ch=='(' || ch=='[') {
				stack.push(ch);
			}
			else if(stack.peek()=='{' && ch=='}'){
				stack.pop();
			}
			else if(stack.peek()=='(' && ch==')'){
				stack.pop();
			}
			else if(stack.peek()=='[' && ch==']'){
				stack.pop();
			}
		}
		if(stack.empty()) {
			System.out.println("balanced");
		}
		else {
			System.out.println("unbalanced");
		}
	}
}
