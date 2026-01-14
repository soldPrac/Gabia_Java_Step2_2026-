package chapter09;

public class ComputerMain_01 {
	public static void main(String[] args) {
		//Computer com1 = new Computer(); //추상클래스는 객체를 만들수 없음
		//Computer com2 = new NoteBook();
		Computer com3 = new DeskTop();
		Computer com4 = new MyNoteBook();
		
		com3.display();
		com3.typing();
		
		com4.display();
		com4.typing();
	}
}
