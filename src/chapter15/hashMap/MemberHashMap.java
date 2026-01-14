package chapter15.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MemberHashMap {
	
	private HashMap<Integer, String> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, String>();
	}

	public void addMember(Member member) {
		if(!hashMap.containsKey(member.memberId())){
			hashMap.put(member.memberId(), member.memberName());
			System.out.println("멤버추가 성공!");
		}
		else {
			System.out.println("해당키는 이미 존재합니다");
		}
	}
	
	
	public void showAllMember() {
		for(Map.Entry<Integer, String> map : hashMap.entrySet()) {
			System.out.println("Id: " + map.getKey() + " | name: " + map.getValue());
		}
	}
	
	public void removeMember(int id) {
		if(hashMap.containsKey(id)) {
			hashMap.remove(id);
			System.out.println("멤버삭제!");
		}
		else {
			System.out.println("존재하지 않는멤버입니다");
		}
	}
}
