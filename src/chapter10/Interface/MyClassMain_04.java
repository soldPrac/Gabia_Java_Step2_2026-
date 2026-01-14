package chapter10.Interface;

public class MyClassMain_04 {
	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		//X클래스 타입
		X xClass = mClass;
		xClass.x();
		
		//y클래스 타입
		Y yClass = new MyClass();
		yClass.y();
		
		//MyInterface클래스 타입
		MyInterface myiClass = new MyClass();
		myiClass.myMethod();
	}
	
}
