package chapter14.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class List_01 {
	
	public static void main(String[] args) {
		//ArrayList<String> student = new ArrayList<String>();
		List<String> students = new ArrayList<String>();
		
		students.add("Alice");
		students.add("Bob");
		students.add("Charlie");
		students.add("Diana");
		
		//학생출력
		for(String s : students) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//특정학생을 제거
		students.remove("Bob");
		
		// 제거 후 학생출력
		for (String s : students) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
	
}
