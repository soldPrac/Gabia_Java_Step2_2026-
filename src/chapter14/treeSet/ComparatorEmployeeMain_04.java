package chapter14.treeSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorEmployeeMain_04 {
	public static void main(String[] args) {
		//Set<Employee> employees = new TreeSet<Employee>(new NameComparator());
		
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee("Bob", 27));
		employees.add(new Employee("Alice", 28));		
		employees.add(new Employee("Charile", 25));
		
		Collections.sort(employees, new NameComparator());
		System.out.println("이름을 기준으로 오름차순 정렬");
		for(Employee employee : employees) {
			System.out.println(employee);
		}
		
		Collections.sort(employees, new AgeComparator());
		
		System.out.println("나이를 기준으로 오름차순 정렬");
		for(Employee employee : employees) {
			System.out.println(employee);
		}
	}
}
