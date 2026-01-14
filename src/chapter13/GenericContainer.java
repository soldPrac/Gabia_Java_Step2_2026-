package chapter13;

public class GenericContainer<T> {
	private T[] items;
	private int count;
	
	public GenericContainer(int size) {
		items = (T[]) new Object[size];
		count = 0;
	}
	
	//아이템을 추가하는 제네릭 메서드
	public void addItem(T item) {
		if(count < items.length) {
//			items[count] = item;
//			count++;
			items[count++] = item;
		}else {
			System.out.println("Container is full");
		}
	}
	
	public void printItems() {
		for(int i = 0; i < count; i++) {
			System.out.print(items[i]+ " ");
		}
		System.out.println();
	}
	
	//<T extends Number> 숫자타입만 받을거라는 선언
	public <T extends Number> double sum(T[] numbers) {
		double total = 0;
		for(T number:numbers) {
			total += number.doubleValue(); //언박싱
		}
		
		 return total;
	}
}
