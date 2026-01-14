package chapter12.string;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain_04 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		String strNow1 = now.toString(); //heap -> String 타입으로 변환
		System.out.println("------------Date-------------");
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println("------------SimpleDate-------------");
		System.out.println(strNow2);
	}
}
