package chapter08;

public class B {
	public void method() {
		A_03 a = new A_03();
		a.field = "value";
		a.method();
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.method();
	}
}
