package chapter14.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain_01 {
	public static void main(String[] args) {
		Set<String> treeSet = new TreeSet<String>();
		
		treeSet.add("Apple");
		treeSet.add("Banana");
		treeSet.add("Orange");
		
		//중복이 허용되지 않음
		treeSet.add("Apple");

		System.out.println("treeSet: " + treeSet);
		
		
		if(treeSet.contains("Banana")) {
			System.out.println("Banana is in the TreeSet");
		}
		
		//요소삭제
		treeSet.remove("Orange");
		
		System.out.println("T0reeSet: " + treeSet);
	}
}
