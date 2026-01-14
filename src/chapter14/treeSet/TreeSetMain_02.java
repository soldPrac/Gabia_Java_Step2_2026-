package chapter14.treeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Mycompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		//* -1 하면 내림차순
		return s1.compareToIgnoreCase(s2) * -1;
	}
	
	
}

public class TreeSetMain_02 {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>(new Mycompare());
		
		set.add("aaa");
		set.add("zzz");
		set.add("ggg");
		set.add("kkk");
		set.add("ccc");

		System.out.println(set);
	}
}
