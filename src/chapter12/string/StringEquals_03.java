package chapter12.string;

public class StringEquals_03 {
	public static void main(String[] args) {
		String strVar1 = new String("홍길동"); //heap 메모리가 같은지 반환
		String strVar2 = "홍길동"; //상수풀 (JVM에서 특별관리하는 메모리 영역 -> Constant pool)
		
		//외부 메모리 주소 비교
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		
		//--------------------------------------------
		// 내부 메모리 주소 비교
		if (strVar1.equals(strVar2)) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		
		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1 == str2); //heap
		System.out.println(str1.equals(str2)); //안에 있는 데이터 비교
		System.out.println("=====================");
		
		//상수풀
		String str3 = "abc";
		String str4 = "abc";		
		System.out.println(str3 == str4); //상수풀은 내용을 봄
		System.out.println("=====================");
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		
		
		
	}
}
