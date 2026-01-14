package chapter09;

public class GameMain_06 {

	public static void main(String[] args) {
		characterFight(new Warrior());
		System.out.println("========================");
		characterFight(new Wizard());

	}
	
	static void characterFight(GameCharacter character) {
		character.fight();
	}

}
