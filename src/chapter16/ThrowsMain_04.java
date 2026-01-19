package chapter16;

import java.util.Scanner;

public class ThrowsMain_04 {
	
	public void gugudan(String str) {
		int num = Integer.parseInt(str);
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", num, i , num * i);
		}
	}
	
	// 입력한 값에서 첫번째 자리만 잘라내기
	public void getNumber(String str) throws Exception {
		String s = str.substring(0, 1);
		gugudan(s);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ThrowsMain_04 test = new ThrowsMain_04();
		System.out.print("구구단 숫자 입력 > ");
		String s = scan.next();
		
		test.gugudan(s);
		try {
			test.getNumber(s);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("숫자를 입력하세요");
		}
		
		System.out.println("program terminated");
	}
}