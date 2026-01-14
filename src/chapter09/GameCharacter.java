package chapter09;

public abstract class GameCharacter {
	// 공통 메서드
	private void enterBattlefield() {
		System.out.println("[입장] 캐릭터가 전장에 등장");
	}

	private void leaveBattlefield() {
		System.out.println("[퇴장] 캐릭터가 전장을 떠남");
	}

	// 하위 클래스가 반드시 구현해야 하는 추상메서드
	protected abstract void attack();

	protected abstract void useUItimate();
	
	//템플릿 메서드 (fight): 전투게임 순서 정의
	public final void fight() {
		enterBattlefield();
		attack();
		useUItimate();
		leaveBattlefield();
	}
}
