package chapter15.hashMap;

public record Member(int memberId, String memberName) {

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}
}
