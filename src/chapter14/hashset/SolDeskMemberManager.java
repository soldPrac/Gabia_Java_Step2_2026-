package chapter14.hashset;

import java.util.HashSet;
import java.util.Set;

public class SolDeskMemberManager {
	//HashSet 공간을 이용해서 멤버정보를 관리
	private Set<SolDeskMember> members;
	
	public SolDeskMemberManager() {
		members = new HashSet<SolDeskMember>();
	}
	
	public void addMember(SolDeskMember mem) {
		if(members.add(mem)) {
			System.out.println(mem.getMemberId() + " 님 회원가입 완료");
		}
		else {
			System.out.println(mem.getMemberId() + " 는(은) 이미 존재하는 아이디 입니다.");
		}
	}
	
	//출력
	public void showAllMemeber() {
		for(SolDeskMember member : members) {
			System.out.println(member);
		}
	}
}
