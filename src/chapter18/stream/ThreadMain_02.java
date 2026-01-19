package chapter18.stream;

public class ThreadMain_02 {
	public static void main(String[] args) {
		Thread_02 t1 = new Thread_02(); //0~9까지의 요소가 temp 배열방에 생성
		
		t1.start(); //Thread1: 소요시간 10초
		
		//Thread2
		try {
			Thread.sleep(11000); //1초
			System.out.println("프로그램 종료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
