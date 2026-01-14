package chapter11;

class Outter{
	int outNum = 100;
	static int sNum = 200;
	
	//class(x) 익명의 클래스
	Runnable getRunnable(int i) { //int i -> final 처리
		int num = 100; //final
		
		class MyRunnable implements Runnable{
			int localNum = 10; //멤버변수
			
			@Override
			public void run() {
				//num = 200;
				//i = 100;
				
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("(외부)outNum = " + outNum);
				System.out.println("(외부 Metaspace)sNum = " + Outter.sNum);
			}
			
		}
		
		return new MyRunnable();
	}
}

public class LocalInner_04 {

	public static void main(String[] args) {
		Outter out = new Outter();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}

}
