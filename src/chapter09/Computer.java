package chapter09;

//추상메서드가 하나라도 존재한다면 abstract 키워드 사용해서 추상클래스 선언
public abstract class Computer {
	//추상메서드 -> Body가 없다
	public abstract void display(); //하위 클래스 구현부에서 구현하여 사용
	
	public abstract void typing();
	//일반 메서드
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
