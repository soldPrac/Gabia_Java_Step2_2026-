package chapter08;

public class DmbCellPhoneMain_07 {
	public static void main(String[] args) {
		//11 Java폰 블랙
		DmbCellPhone dmb = new DmbCellPhone("Java폰", "블랙", 11);
		
		//상속받은 필드
		System.out.println("모델: " + dmb.model);
		System.out.println("색상: " + dmb.color);
		System.out.println();
		
		//자식클래스 필드
		System.out.println("채널: " + dmb.channel);
		System.out.println();
		
		//전화통화구현
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세요");
		dmb.receiveVoice("안녕하세요");
	}
}
