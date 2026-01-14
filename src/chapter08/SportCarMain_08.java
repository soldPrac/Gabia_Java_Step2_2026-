package chapter08;

public class SportCarMain_08 extends Car {
	@Override
	public void speedUp() {
		speed += 10;
		System.out.println("speed: " + speed);
	}
	
//	@Override
//	public void stop() {
//		System.out.println("final 키워드가 붙은 메소드는 재정의 불가");
//	}

	public static void main(String[] args) {
		SportCarMain_08 ac = new SportCarMain_08();
		ac.speedUp();
		ac.stop();

	}

}
