package chapter07;

public class Company {
	private static Company instance = new Company();
	
	public Company() {
		
	}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
}
