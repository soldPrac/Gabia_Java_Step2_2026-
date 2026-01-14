package chapter14.treeSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableStudentMain_03 {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Alice", 85));
		students.add(new Student("Bob", 85));
		students.add(new Student("Charlie", 80));
		
		Collections.sort(students);
		
		for(Student student : students) {
			System.out.println(student);
		}
		
		
	}
}
