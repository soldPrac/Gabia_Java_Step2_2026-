package chapter15.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEmployeeMain_03 {
	public static void main(String[] args) {
		TreeMap<Integer, Employee> employeeMap = new TreeMap<Integer, Employee>();
		
		employeeMap.put(1093, new Employee("강호동", 40));
		employeeMap.put(1003, new Employee("이슬기", 32));
		employeeMap.put(1192, new Employee("김하윤", 26));
		employeeMap.put(1073, new Employee("박재윤", 28));
		
		for(Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
			System.out.println("사원번호: " + entry.getKey() + " | " + entry.getValue());
		}
		
		int employeeId = 1003;
		System.out.println(employeeMap.get(employeeId));
	}
	
	
}
