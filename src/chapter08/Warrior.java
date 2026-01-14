package chapter08;

public class Warrior extends Character{

	@Override
	public int attack(int power) {
		return power*2;
	}
}
