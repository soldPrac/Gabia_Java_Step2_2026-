package chapter15.hashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapMain_05 {
	public static void main(String[] args) {
		// #1.Collections.synchronizedMap 객체 생성을 이용한 동기화 작업
		Map<String, Integer> inventory = Collections.synchronizedMap(new HashMap<>()); 
		
		// 상품명과 재고 수량을 키와 같으로 HashMap에 추가
		inventory.put("apple", 50);
		inventory.put("banana", 30);
		inventory.put("grape", 20);
		inventory.put("Mango", 10);
		
		//상품재고 출력
		System.out.println("-----------상품재고 출력--------------");
		for(Map.Entry<String, Integer> entry : inventory.entrySet()) {
			System.out.println(entry.getKey() + ", " + entry.getValue() + "개");
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("\n재고를 확인할 상품명을 입력하세요: ");
		String product = scan.nextLine(); //key
		
		if(inventory.containsKey(product)) {
			System.out.println(product + "의 재고는: " + inventory.get(product) + "개입니다");
		}
		else {
			System.out.println("해당 상품은 재고에 없습니다");
		}
		
		// 상품의 재고 업데이트
		System.out.print("\n재고를 업데이트할 상품명을 입력하세요: ");
		String updateProduct = scan.nextLine(); //key(Mango)
		
		if(inventory.containsKey(updateProduct)) {
			System.out.println("추가할 수량을 입력하세요: ");
			int addQuantity = scan.nextInt();
			inventory.put(updateProduct, inventory.get(updateProduct) + addQuantity);
			System.out.println(updateProduct + "의 재고는 현재 " + inventory.get(updateProduct) + "개 입니다.");
		}
		else {
			System.out.println("해당 상품은 재고에 없습니다");
//			System.out.println("해당 상품의 수량을 입력하세요: ");
//			int addNewQuantity = scan.nextInt();
//			inventory.put(updateProduct, addNewQuantity);
		}
	}
}
