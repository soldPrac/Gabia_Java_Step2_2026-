package chapter14.treeSet;

//record: 멤버변수 선언, 생성자 오버로딩, getter/setter 자동생성 (현업에서는 아직 안씀)
public record Employee(String name, int age) {

	@Override
	public String toString() {
		return name + ": " + age;
	}

}
