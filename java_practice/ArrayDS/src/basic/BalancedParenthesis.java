package basic;

import java.util.Stack;

public class BalancedParenthesis {
	public static void main(String[] args) {
		System.out.println(isBalanced("{([)}]"));
	}
	
	public static boolean isBalanced(String str) {
		Stack<Character> st = new Stack<Character>();
		
		char data[] = str.toCharArray();
		
		for(char ch : data) {
			if(ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
			}
			else {
				if(st.isEmpty())
					return false;
				
				char top = st.pop();
				
				if(ch == ')' && top != '('
			|| ch == '}' && top != '{'
			|| ch == ']' && top != '[') {
					return false;
				}
				
			}
		}
		
		return st.isEmpty();
	}
}
