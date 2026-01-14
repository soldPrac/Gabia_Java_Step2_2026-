package chapter09;

public class Warrior extends GameCharacter{

	@Override
	protected void attack() {
		System.out.println("검을 휘두릅니다.");
		
	}

	@Override
	protected void useUItimate() {
		System.out.println("파멸의 일격");
	}

}
