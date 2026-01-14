package chapter11;

class OutterRunnalbe{
	//class(heap)
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명의 클래스 변수");
		}
	};
}

public class AnonyMousInnerMain_06 {

	public static void main(String[] args) {
		OutterRunnalbe out = new OutterRunnalbe();
		out.runner.run();
	}

}
