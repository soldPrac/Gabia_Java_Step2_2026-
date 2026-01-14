package chapter11;

class OutterRun{
	//익명의 클래스
	Runnable getRunnable(int i) {
		int num = 100;
		return new Runnable() {
			
			@Override
			public void run() {
				//num = 200;
				//i = 10;
				System.out.println(i);
				System.out.println(num);
			}
		};		
	}
}

public class AnonyMousInnerMain_05 {

	public static void main(String[] args) {
		OutterRun out = new OutterRun();
		Runnable runnable = out.getRunnable(10);
		runnable.run();
		
		Runnable ramdaRunnalbe = ()->{
			int num = 300;
			System.out.println("람다식을 사용한 러너블" + num);
		};
		ramdaRunnalbe.run();
	}

}
