package chapter11.RamdaPractice;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RamdaPrcatice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> consumer = (Integer i)-> {
				System.out.println("consumer " + i);
		};
		
		consumer.accept(10);
		
		Supplier<Integer> supplier = () -> 100;
		
		System.out.println("Supplier " + supplier.get());
		
		Supplier<Float> supplier2 = () -> { return 34.32f; };
		System.out.println("Supplier2 " + supplier2.get());
		
		Function<Integer, String> function = (Integer i) -> {
			i++;
			return "int-> " + i;
		};
		System.out.println("function: " + function.apply(1000));
		
		Predicate<Integer> predicate = (Integer i) -> {
			if(i > 10) return true;
			else return false;
		};
		System.out.println("predicate: " + predicate.test(100));
		
		Runnable runnable = () -> {
			System.out.println("Run! Run!");
		};
		runnable.run();
		
		BiConsumer<Integer, Integer> biconsumer = (a, b) -> {
			System.out.println(a + b);
		};
		biconsumer.accept(3, 5);
	}

}
