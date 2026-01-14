package chapter09;

public class Wizard extends GameCharacter{

	@Override
	protected void attack() {
		System.out.println("파이어볼");
	}

	@Override
	protected void useUItimate() {
		System.out.println("헬파이어");
	}

}
