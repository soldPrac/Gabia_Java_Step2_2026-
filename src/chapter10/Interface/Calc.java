package chapter10.Interface;

public interface Calc {
	public static final double PI = 3.14;
	int ERROR = -9999999; //인터페이스에서 선언한 변수들은 모두 static 판정
	
	public int add(int num1, int num2);
	public int substaract(int num1, int num2);
	public int times(int num1, int num2);
	public int divide(int num1, int num2);
	
	//인터페이스에서 일반메서드는 사용 불가능
//	public void display() {
//		
//	}
	
	
	//자바 8부터 제공 -> 기본 수행문을 구현할때 사용(오버라이딩 가능)
	default void description() {
		System.out.println("정수계산기");
		myMethod();
	}
	
	//static 메소드는 인터페이스여도 사용가능 (JAVA 8 부터 가능)
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		//myMethod() // static 메소드는 메타스페이스에 있기 때문에 스택영역에 있는 일반 메소드 호출 불가 같은 static 끼리만 가능
		myStaticMethod();
		
		return total;
	}
	
	//Java 9부터 가능 -> private 메서드는 현재의 클래스에서만 사용가능
	private void myMethod() {
		System.out.println("private 메서드");
	}
	
	//정적메서드 -> 객체 생성과 상관없이 클래스명으로 사용가능
	private static void myStaticMethod() {
		System.out.println("private static 메서드");
	}
}
