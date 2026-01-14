package chapter14.Stack;

import java.util.Stack;

public class StatckTest_01 {
	public static void main(String[] args) {
		Object obj;
		
		//인증코드가 들어와야 다음 절차가 진행될때
		Stack<Object> st = new Stack<Object>();
		
		if(st.empty()) {
			for(int i = 0; i < 3; i++) {
				st.push(new String("Hi" + i));
				System.out.println("입력 " + i + "번째: " + st.peek());
			}
		}
		System.out.println();
		System.out.println("현재 출력 데이터: " + st.pop());
		System.out.println("현재 Top의 위치(peek): " + st.peek());
		System.out.println();
		System.out.println("현재 출력 데이터: " + st.pop());
		System.out.println("현재 Top의 위치(peek): " + st.peek());
		System.out.println();
		st.push(new String("everybody"));
		System.out.println("현재 Top의 위치(peek): " + st.peek());
		System.out.println();
		st.push(new String("Happy Day"));
		System.out.println("현재 Top의 위치(peek): " + st.peek());
	}
}
