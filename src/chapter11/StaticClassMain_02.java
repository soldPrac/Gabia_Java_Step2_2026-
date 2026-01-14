package chapter11;

import javax.swing.JOptionPane;

class Out2{
	static int a = 1; //정적변수로 모든 객체가 공유
	int b;
	
	public static class In{
		public String Infun() {
			return a + "번째 Non-Static 내부";
		}
	}
}

public class StaticClassMain_02 {

	public static void main(String[] args) {
		//static 클래스는 직접 접근이 가능
		Out2.In obj1 = new Out2.In();
		//내부 클래스 메서드
		String str = obj1.Infun();
		JOptionPane.showInternalMessageDialog(null, str + "\n Success");
	}

}
