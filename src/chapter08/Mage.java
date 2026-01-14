package chapter08;

public class Mage extends Character{
	@Override
	public int attack(int power) {
		return power*3;
	}
}
