package chapter14.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayList_02 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("list.size: " + list.size());
		
		list.add(100);
		list.add(50);
		System.out.println("list.size: " + list.size());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-------Iterator-------");
		//list,iterator(): 일반데이터를 반복구조로 형변환 -> hasNext() 사용
 		Iterator<Integer> it = list.iterator(); //모든 컬렉션에는 interator가 포함
 		//for문 대신 쓰는 이유는 컬렉션에선 이게 더 빨라서
 		while(it.hasNext()) {
 			int v = it.next(); //unBoxing
 			System.out.println(v);
 		}
	}
}
