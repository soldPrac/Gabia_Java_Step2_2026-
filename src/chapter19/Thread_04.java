package chapter19;


class Counter {
	private int count = 0;
	
	//공유 자원에 대해서 한번에 하나의 스레드만 접근 가능하게 함
	synchronized void increment() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
}
public class Thread_04 {
	public static void main(String[] args) {
		Counter counter = new Counter();
		
		//Runnable이 Thread의 run 역할을 함
		Runnable task = () -> {
			for(int i = 0; i < 1000; i++) {
				counter.increment();
				//System.out.println(counter.getCount());
			}			
		};
		
		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);
		
		//동시실행이 되어도 충돌이 없음
		thread1.start(); //runnable task
		thread2.start();
		
		try {
			thread1.join(); //thread1이 끝날때까지 기다림
			thread2.join();
		}catch (Exception e){
			e.printStackTrace();
		}
		
		System.out.println(counter.getCount());
	}
}
