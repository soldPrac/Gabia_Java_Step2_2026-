package chapter07;

import java.util.Scanner;

public class Guide {
	static String point;
	Guest[] guest;
	Scanner scan;
	
	public Guide() {
		
	}
	
	public Guide(int n) {
		//목적지
		point = "발리";
		//관광객수 만큼 메모리 참조공간 확보
		guest = new Guest[n];
		//초기화
		for(int i = 0; i < n; i++) {
			guest[i] = new Guest();
		}
	}
	
	public static String getPoint() {
		return point;
	}
}
