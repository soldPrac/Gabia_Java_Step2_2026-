package chapter11;

public class FunInterMain_07 {
	public void test() {
		
		//JAVA8부터 [FunInter func1 = ] << 생략가능
		new FunInter() {
			
			@Override
			public void printData() {
				System.out.println("목요일!!");
				
			}
		}.printData(); //객체명 대신 메서드 호출
	}
	public static void main(String[] args) {
		FunInterMain_07 funinter = new FunInterMain_07();
		funinter.test();
	}
}
