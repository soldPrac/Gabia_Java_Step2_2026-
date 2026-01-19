package chapter19;

public class Thread_Runnable_07 implements Runnable{
	public static void main(String[] args) {
		
		//일반 실행
		System.out.println("메인 메서드 시작");
		Thread_Runnable_07 t1 = new Thread_Runnable_07();
		t1.run();
		System.out.println("----------------------------");
		
		Thread mThread = new Thread(t1); //t1객체를 스레드로 변환
		mThread.start();
		System.out.println("메인스레드 종료");
	}

	@Override
	public void run() {
		System.out.println("run() 메서드 실행");
		first();
	}
	
	public void first() {
		System.out.println("first() 메서드 실행");
		second();
	}
	
	public void second() {
		System.out.println("second() 메서드 실행");
	}
}
