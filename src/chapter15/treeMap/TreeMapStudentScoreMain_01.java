package chapter15.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapStudentScoreMain_01 {
	public static void main(String[] args) {
		//정렬이 된 Map
		TreeMap<String, Integer> studentScore = new TreeMap<String, Integer>();
		
		studentScore.put("David", 95);
		studentScore.put("Bob", 92);
		studentScore.put("Alice", 85);
		studentScore.put("Charlie", 78);
		System.out.println("==학생 성적 출력(이름순 정렬)==");
		
		for(Map.Entry<String, Integer> entry : studentScore.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		String studentName = "Bob";
		System.out.println("\n" + studentName + "의 성적: " + studentScore.get(studentName));
	}
}
