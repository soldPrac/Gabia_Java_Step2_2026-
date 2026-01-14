package chapter12.clone;

public class objectCloneMain_02 {
	public static void main(String[] args) throws CloneNotSupportedException{
		Circle circle = new Circle(10, 20, 30);
		Circle circlecopy = (Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(circlecopy);
		
		//hash
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(circlecopy));
	}
}
