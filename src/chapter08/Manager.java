package chapter08;

public class Manager extends Employee {
	String department;

	public Manager(String name, String department, int salary) {
		super(name, salary);
		this.department = department;
	}

	@Override
	public void work() {
		System.out.println(name + "팀장이 " + department + "부서를 관리중입니다.");
	}
	
	public void approveLeave(String employeeNmae) {
		System.out.println(name + "팀장이 " + employeeNmae + "부서의 휴가를 관리중입니다.");
	}
	
}
