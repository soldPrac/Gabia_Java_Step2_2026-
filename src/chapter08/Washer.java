package chapter08;

public class Washer extends Appliance {

	public Washer(String brand) {
		super(brand);
	}
	
	void turnOn() {
		super.turnOn();
		System.out.println("세탁기의 turnOn");
	}
	
	@Override
	void turnOff() {
		super.turnOff();
		System.out.println("세탁기를 끕니다");
	}

}
