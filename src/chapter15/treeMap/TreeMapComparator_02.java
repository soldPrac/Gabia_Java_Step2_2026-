package chapter15.treeMap;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapComparator_02 {
	public static void main(String[] args) {
		TreeMap<Integer, Integer> scoreMap = new TreeMap<Integer, Integer>(Comparator.reverseOrder());
		
		scoreMap.put(1434, 85);
		scoreMap.put(934, 95);
		scoreMap.put(1735, 83);
		
		System.out.println("전체 출력" + scoreMap);
		
		Set<Integer> keySet = scoreMap.keySet();
		Iterator<Integer> iter = keySet.iterator();
		
		while(iter.hasNext()) {
			int key = iter.next();
			System.out.println(key + ": " + scoreMap.get(key));
		}
		
		//TreeMap 메서드
		System.out.println("가장 큰 학생 번호: " + scoreMap.firstKey());
		System.out.println("가장 작은 학생 번호: " + scoreMap.lastKey());
	}
}
