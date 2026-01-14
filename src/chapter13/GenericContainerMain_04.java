package chapter13;

public class GenericContainerMain_04 {
	public static void main(String[] args) {
		//문자열 아이템을 저장하는 객체
		GenericContainer<String> stringContainer = new GenericContainer<String>(5);
		
		stringContainer.addItem("Apple");
		stringContainer.addItem("Banana");
		stringContainer.addItem("Cherry");
		
		stringContainer.printItems();
		
		// 타입제한으로 사용 불가능
		//String[] strArray = { "1", "2", "3", "4", "5" };
		//System.out.println("Sum of int array: " + stringContainer.sum(strArray));
		
		GenericContainer<Integer> integerContainer = new GenericContainer<Integer>(5);
		integerContainer.addItem(1);
		integerContainer.addItem(2);
		integerContainer.addItem(3);
		integerContainer.addItem(4);
		integerContainer.printItems();
		
		//타입제한으로 사용 불가능
		
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		System.out.println("Sum of int array: " + integerContainer.sum(intArray));
		
		
		GenericContainer<Double> doubleContainer = new GenericContainer<Double>(5);
		doubleContainer.addItem(1.2);
		doubleContainer.addItem(2.5);
		doubleContainer.addItem(3.1);
		doubleContainer.addItem(4.9);
		doubleContainer.printItems();
		
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		System.out.println("Double of int array: " + doubleContainer.sum(doubleArray));
		
	}
}
