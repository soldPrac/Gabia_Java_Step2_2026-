package chapter19;

//데몬 스레드: 메인스레드 뒤에 돌고 있다가 메인스레드가 죽으면 같이 죽는 스레드
public class DaemonTread_09 implements Runnable{
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		DaemonTread_09 dm = new DaemonTread_09();
		Thread t = new Thread(dm); //일반 객체를 스레드로 변환 -> run()을 start()로 변경
		t.setDaemon(true); //데몬 스레드로 변환(메인이 종료되면 자동 종료)
		t.start();
		
		for(int i = 0; i < 15; i++) {
			//메인스레드
			try {
				Thread.sleep(1000); //1초
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
			
			if(i == 3) {
				autoSave = true;
			}
		}
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			if(autoSave) {
				System.out.println("자동 저장 됩니다");
			}
		}
	}
}
