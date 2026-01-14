package chapter07;

public class Bank {
	private String Point;
	private String tel;
	static float interest;
	
	public Bank() {
		
	}

	public Bank(String point, String tel) {
		Point = point;
		this.tel = tel;
	}
	
	// 결과 출력 메서드
	public void getBank() {
		System.out.println("지점: " + Point + "\n" + "전화번호: " + tel + "\n은행이자: " + interest);
	}
}
