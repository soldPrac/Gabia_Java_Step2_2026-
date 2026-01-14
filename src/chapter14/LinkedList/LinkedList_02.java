package chapter14.LinkedList;

import java.util.LinkedList;

public class LinkedList_02 {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		myList.add(1, "D");
		System.out.println(myList);
		
		myList.addFirst("S");
		System.out.println(myList);
		System.out.println(myList.removeLast());
		System.out.println(myList);
	}

}
