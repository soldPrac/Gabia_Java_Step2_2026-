package chapter09;

public class CarMain_05 {

	public static void main(String[] args) {
		Car[] cars = {new AICar(), new ManualCar()};
		for(Car c : cars) {
			carRun(c);
		}
	}
	
	static void carRun(Car car) {
		car.run();
		System.out.println("===========");
	}

}
