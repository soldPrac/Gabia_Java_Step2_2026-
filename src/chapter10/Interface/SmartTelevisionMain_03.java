package chapter10.Interface;

public class SmartTelevisionMain_03 {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		tv.turnOn();
		tv.search("youtube.com");
		tv.setVolume(80);
		tv.turnOff();
		System.out.println();
		
		Remote tv2 = tv;
		tv2.turnOn();
		tv2.setVolume(-1);
		tv2.turnOff();
		System.out.println();
		
		Searchable tv3 = tv;
		tv3.search("naver.com");
		

	}

}
