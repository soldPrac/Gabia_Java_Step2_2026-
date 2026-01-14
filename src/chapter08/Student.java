package chapter08;

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
	
	public void Disp() {
		System.out.println("이름: " + name);
		System.out.println("SSN: " + ssn);
		System.out.println("학번: " + studentNo);
	}
	
}
