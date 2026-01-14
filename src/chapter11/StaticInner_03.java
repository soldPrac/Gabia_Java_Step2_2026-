package chapter11;

public class StaticInner_03 {

	int a = 10; //stack 영역
	private int b = 10; //stack이지만 class 내부에서만 사용가능
	static int c = 200; //Metaspace 영역
	
	//내부클래스 Metaspace 영역
	static class Inner{
		static int d= 1000;
		
		public void printData() {
			//System.out.println("Metaspace 영역이 아니므로 static 변수 사용 불가" + a);
			//System.out.println("Metaspace 영역이 아니므로 static 변수 사용 불가" + b);
			System.out.println("Metaspace 영역이므로 사용 가능" + c);
			System.out.println("Metaspace 영역이므로 사용 가능" + d);
		}
	}
	public static void main(String[] args) {
		Inner inner = new Inner();
		inner.printData();
	}

}
