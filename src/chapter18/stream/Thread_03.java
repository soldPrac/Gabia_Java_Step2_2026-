package chapter18.stream;

class MyThread extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Thread " + Thread.currentThread().getName() + ": " + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class Thread_03 {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		
		thread1.start();
		thread2.start();
	}
}
