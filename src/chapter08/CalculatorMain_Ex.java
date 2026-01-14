package chapter08;

import java.util.Scanner;

public class CalculatorMain_Ex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		int num1 = Integer.parseInt(scan.nextLine());
		int num2 = Integer.parseInt(scan.nextLine());
		
		CalPlus calP = new CalPlus();
		CalMinus calM = new CalMinus();
		
		System.out.println("CalPlus: " + calP.getResult(num1, num2));
		System.out.println("CalMinus: " + calM.getResult(num1, num2));
		
		Example[] calculators = { new CalPlus(), new CalMinus() };
		
		for(Example calc : calculators) {
			System.out.println("Result: " + calc.getResult(num1, num2));
		}
		
		//메서드 활용
		int plus = calc(new CalPlus(), num1, num2);
		System.out.println("두 수의 합: " + plus);
		int mius = calc(new CalPlus(), num1, num2);
		System.out.println("두 수의 합: " + mius);
	}
	
	static int calc(Example exam, int a, int b) {
		return exam.getResult(a, b);
	}
	
//	static void BA(Example01 ex) {
//		System.out.println(ex.getClass().getSimpleName() + " : " + ex.getResult(20, 10));
//	}
//	
//	static void BB(Example01[] ex) {
//		for(Example01 a : ex)
//			System.out.println(a.getClass().getSimpleName() + " : " + a.getResult(20, 10));
//	}	
//	
//	public static void main(String[] args) {
//		BA(new CalPlus());
//		BA(new CalMinus());
//		
//		System.out.println();
//		
//		Example01[] calculators = {new CalPlus(), new CalMinus()};
//		BB(calculators);
//	}

}
