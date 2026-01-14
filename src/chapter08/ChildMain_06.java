package chapter08;

public class ChildMain_06 {

	public static void main(String[] args) {
		Child child = new Child();
		
		child.method1();
		child.method2();
		child.method3();
		System.out.println();
		
		Parent parent1 = child;
		parent1.method1();
		parent1.method2();
		System.out.println();
		
		Parent parent2 = new Parent();
		parent2.method1();
		parent2.method2();

	}

}
