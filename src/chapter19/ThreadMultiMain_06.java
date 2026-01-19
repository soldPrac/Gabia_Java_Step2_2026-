package chapter19;

public class ThreadMultiMain_06 {
	public static void main(String[] args) {
		
		//멀티스레드
		ThreadMulti_05 t1 = new ThreadMulti_05();
		ThreadMulti_06 t2 = new ThreadMulti_06();
		
		t1.start();
		t2.start();
	}
}
