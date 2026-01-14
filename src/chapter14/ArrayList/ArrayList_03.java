package chapter14.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_03 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("지건우");
		list.add("김태완");
		list.add("이연승");
		list.add("김자월");
		list.add("김청우");
		list.add("김민석");
		
		System.out.println("아이들팀 전체: " + list);
		System.out.println("--------------------------------");
		
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.print(str + " ");
		}
		System.out.println();
	}
}
