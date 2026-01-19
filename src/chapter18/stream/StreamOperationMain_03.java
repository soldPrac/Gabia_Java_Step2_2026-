package chapter18.stream;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperationMain_03 {
	public static void main(String[] args) {
		// Stream.of(): 객체를 스트림으로 변환
		Stream<File> stream = Stream.of(new File("file1.txt"), new File("file2.txt"), new File("Ex2"),
				new File("Ex2.bak"), new File("Test.java"));
		
		// 파일의 확장자를 추출 후 중복 제거하여 출력
		stream.map(File::getName) //파일 이름 모으기
		.filter(f->f.indexOf(".") > -1) //이름에서 확장자가 있는 파일만 추출 -1은 배열 뒤에서 부터 셀때
		.map(f -> f.substring(f.lastIndexOf(".") + 1)) //확장자만 모음
		.distinct() //중복제거
		.forEach(System.out::println);
		
		System.out.println("---------------------------------------------------");
		
		// Arrays.asList(): 배열을 스트림으로 변환
		// 어레이 -> 리스트 -> 스트림
		List<String> list = Arrays.asList("Reflection", "Collection", "Stream", "Structure", "State", "Flow", "Sorting",
				"Mapping", "Reduction", "Stream");
		
		//중간결과 저장
		Set<String> intermediaResults = new HashSet<>();
		
		List<String> result = list.stream() //stream으로 형변환
				.filter(s -> s.startsWith("S")) //S로 시작하는 문자열
				.map(String::toUpperCase) // 모두 대문자
				.distinct() // 중복제거
				.sorted() // 정렬
				.peek(s -> intermediaResults.add(s)) //중간결과 저장
				.collect(Collectors.toList()); //새로운 리스트 생성
		
		System.out.println();
		//중간연산결과
		System.out.println("resfult result");
		result.forEach((i) -> System.out.println(i + " "));
	}
}
