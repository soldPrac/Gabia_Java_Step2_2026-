package chapter08;

public class TV extends Appliance{
	public TV(String brand) {
		super(brand);
	}

	@Override
	void turnOn() {
		super.turnOn();
		System.out.println("TV 화면을 켭니다.");
		
	}
	
	
}
