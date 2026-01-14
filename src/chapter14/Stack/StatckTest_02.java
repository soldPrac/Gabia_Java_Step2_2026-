package chapter14.Stack;

import java.util.ArrayList;

class MyStack{
	private ArrayList<String> arrayStack = new ArrayList<String>();

	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		
		if(len == 0) {
			System.out.println("스택이 비어있음");
			return null;
		}
		
		return (arrayStack.remove(len - 1));
	}

	@Override
	public String toString() {
		return arrayStack.toString();
	}
	
	
}

public class StatckTest_02 {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack.toString());
		
	}
}
