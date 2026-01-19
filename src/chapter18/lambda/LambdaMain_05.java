package chapter18.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class LambdaMain_05 {
	public static void main(String[] args) {
		
		//두 개의 인자를 받아서 합 리턴
		BiFunction<Integer, Integer, Integer> f1 = (x, y) -> x+y;
		System.out.println("15와 24의 합은: " + f1.apply(15, 24));
		
		//두 개의 String를 받아서 하나의 문자열로 합하여 리턴
		BiFunction<String, String, String> f2 = (s1, s2) -> s1.concat(s2);
		System.out.println(f2.apply("람다", "식"));
		
		// 두 개의 인자를 받아서 큰수를 리턴
		BiConsumer<Integer, Integer> f3 = (x, y) -> System.out.println(x > y ?x:y);
		System.out.print("10과 9중 큰 수 출력: ");
		f3.accept(10, 9);
		
		// 매개변수(인자)로 받은 문자열과 숫자가 동일한 크기 인지 판별
		BiPredicate<String, Integer> f4 = (x, y) -> x.length() == y;
		System.out.println("apple은 5자이다: " + f4.test("apple", 5));
		System.out.println("pineapple은 5자이다: " + f4.test("pineapple", 5));
	}
}
