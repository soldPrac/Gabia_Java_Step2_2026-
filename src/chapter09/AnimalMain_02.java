package chapter09;

public class AnimalMain_02 {
	public static void main(String[] args) {
		Animal[] animals = { new Dog(), new Cat() };
		
		for(Animal a : animals) {
			AnimalSound(a);
		}
	}
	
	static void AnimalSound(Animal animal) {
		animal.sound();
	}
}
