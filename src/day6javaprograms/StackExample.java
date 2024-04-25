package day6javaprograms;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		
			Stack<Integer> stack = new Stack<Integer>();
			stack.push(3);
			stack.push(1);
			stack.push(2);
			stack.push(4);
			stack.push(4);
			stack.push(null);
			
			
			System.out.println(stack);
			
		/*	for(int i = 0 ; i<stack.size(); i++) {
				
				System.out.println(stack.get(i));
			}
			*/
			
			System.out.println("Using Peek: "+stack.peek());
			System.out.println("Using Pop: "+stack.pop());
			System.out.println(stack);
		
	}

}
