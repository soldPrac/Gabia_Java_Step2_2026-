package chapter08;

public class ApplianceMain_05 {

	public static void main(String[] args) {
		//Appliance tv = new TV("삼성"); << 이거 됨
		TV tv = new TV("삼성");
		tv.turnOn();
		System.out.println("-------------");
		Washer washer = new Washer("LG");
		washer.turnOff();
		System.out.println("-------------");
		
		Appliance[] list = new Appliance[3]; //참조공간 확보
		list[0] = new Washer("LG");
		list[1] = new Washer("Samsung");
		list[2] = new Washer("Daewoo");

		for(Appliance a : list) {
			a.turnOn();
		}
	}

}
