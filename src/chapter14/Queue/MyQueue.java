package chapter14.Queue;

import java.util.LinkedList;

public class MyQueue {
	private LinkedList<Object> queueList = new LinkedList<Object>();
	
	public void enQueue(Object obj) {
		queueList.add(obj);
	}
	
	public Object deQueue() {
		if(queueList.isEmpty()) {
			System.out.println("큐가 비어 있음!");
			return null;
		}
	
		return queueList.remove(0);
	}

	@Override
	public String toString() {
		return queueList.toString();
	}
	
	
}
