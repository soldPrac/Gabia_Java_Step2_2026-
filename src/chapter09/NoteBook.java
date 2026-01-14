package chapter09;

//추상메서드는 반드시 구현
//구현하지 않는다면 abstract 키워드를 넣어서 추상클래스임을 표시
public abstract class NoteBook extends Computer {

	@Override
	public void display() {
		System.out.println("NoteBook Display()");
		
	}
	
}
