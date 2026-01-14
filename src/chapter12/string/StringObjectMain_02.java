package chapter12.string;

public class StringObjectMain_02 {
	public static void main(String[] args) {
		StringObject v1 = new StringObject();
		v1.setValue(v1);
		
		System.out.println(v1.getValue());
		StringObject v2 = new StringObject();
		
		//AutoBoxing
		//Integer v2= new Integer(100);
		v2.setValue(100);
		System.out.println(v2.getValue());
		
		//---------------------
		int i = (int)v2.getValue(); //unBoxing 객체가 바뀌었을때
		System.out.println(i+2);
	}
		
}
	
