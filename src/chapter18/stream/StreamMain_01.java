package chapter18.stream;

import java.util.Arrays;
import java.util.List;

public class StreamMain_01 {
	public static void main(String[] args) {
		//Arrays 관련 메소드는 외워두는게 좋음
		List<String> names = Arrays.asList("java", "c", "cpp", "python", "kotlin","swift");
		
		//길이가 3이상인 이름을 대문자로 바꾸고 정렬하여 출력
		//filter -> 데이터를 조건에 맞춰 필터링
		names.stream().filter(name -> name.length() >= 3).map(String::toUpperCase).sorted()
				.forEach(System.out::println);
	}
}
