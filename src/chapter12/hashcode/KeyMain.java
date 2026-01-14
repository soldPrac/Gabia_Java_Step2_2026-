package chapter12.hashcode;

public class KeyMain {
	public static void main(String[] args) {
		Key hashKey1 = new Key(1);
		Key hashKey2 = new Key(1);
		Key hashKey3 = new Key("java");
		Key hashKey4 = new Key("java");
		
		//물리적인 주소
		System.out.println(hashKey1);
		System.out.println(hashKey2);
		System.out.println("=================================");
		System.out.println(hashKey3);
		System.out.println(hashKey4);
		System.out.println("=================================");
		
		
		if(hashKey1.equals(hashKey2)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		System.out.println("=================================");
		if(hashKey3.name.equals("java")) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
}
