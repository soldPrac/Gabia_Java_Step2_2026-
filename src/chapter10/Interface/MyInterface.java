package chapter10.Interface;

//인터페이스에서는 extends 키워드를 이용한 다중상속이 가능
// interface를 class로 바꾸면 안됨
public interface MyInterface extends X,Y{
	void myMethod();
}
