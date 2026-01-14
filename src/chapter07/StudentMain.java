package chapter07;

public class StudentMain {

	public static void main(String[] args) {
		// studentLee에 이수정으로 설정후 serialNum과 StudentName 출력
		
		Student_03 studentLee = new Student_03();
		studentLee.setStudentName("이수정");
		
		System.out.println("학번: " + studentLee.getStudentName());
		System.out.println("이름: " + studentLee.getSerialNum());
		System.out.println("이름: " + studentLee.studentID);
		System.out.println();
		
		Student_03 studentKim = new Student_03();		
		studentKim.setStudentName("김재윤");
		
		System.out.println("학번: " + studentKim.getStudentName());
		System.out.println("이름: " + studentKim.getSerialNum());
		System.out.println("이름: " + studentKim.studentID);
		System.out.println();
		
		Student_03 studentPark = new Student_03();		
		studentPark.setStudentName("박봄");
		
		System.out.println("학번: " + studentPark.getStudentName());
		System.out.println("이름: " + studentPark.getSerialNum());
		System.out.println("이름: " + studentPark.studentID);
		System.out.println();

	} 	

}
