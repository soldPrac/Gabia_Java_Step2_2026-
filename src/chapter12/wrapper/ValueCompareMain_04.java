package chapter12.wrapper;

public class ValueCompareMain_04 {
	public static void main(String[] args) {
		// 오토박싱의 범위
		System.out.println("[-128 ~ 128초과할 경우]"); // 1byte = 8bit;
		Integer obj1 = 300; //4byte = 32bit
		Integer obj2 = 300; //4byte = 32bit
		
		//주소비교
		//내부값 비교가 아닌 외부 주소 비교
		System.out.println("==결과: " + (obj1 == obj2)); 
		System.out.println("==언박싱한 후 결과: " + (obj1.intValue() == obj2.intValue())); 
		
		System.out.println("[-128 ~ 128범위내일 경우]"); // 1byte = 8bit;
		Integer obj3 = 100; //4byte = 32bit
		Integer obj4 = 100; //4byte = 32bit
		
		//주소비교(1byte내에서는 캐싱(cache)되어 같은 객체를 사용)
		System.out.println("==결과: " + (obj3 == obj4)); 
		System.out.println("==언박싱한 후 결과: " + (obj3.intValue() == obj4.intValue())); 
		System.out.println("==equals: " + (obj3.equals(obj4))); 
	}
}
