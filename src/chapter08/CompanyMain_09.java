package chapter08;

public class CompanyMain_09 {

	public static void main(String[] args) {
		Employee employee = new Employee("홍길동", 200);
		employee.work();
		employee.getInfo();
		
		Manager manager = new Manager("채문수", "개발", 300);
		manager.work();
		manager.getInfo();
		manager.approveLeave("홍길동");
		
		//Employee와 Manager 클래스의 교집합 기능한 사용가능
		Employee manager2 = new Manager("김동수","지원", 300);
		manager2.work();
		manager2.getInfo();
		//manager2.approveLeave("홍길동"); //불러올수 없음
	}

}
