package chapter11;

import javax.swing.JOptionPane;

class Out{
	static int a = 1;
	
	//내부 클래스
	public class In{
		
		public String Infun() {
			return a + "번째 Non-Static 내부";
		}
	}//In Class
}//Out class

public class NonStatic_01 {

	public static void main(String[] args) {
		//#1 Out class
		Out obj1 = new Out();
		//#2 In class
		Out.In obj2 = obj1.new In();
		String str = obj2.Infun();
		JOptionPane.showInternalMessageDialog(null, str + "\n Success");
	}

}
