package chapter14.comparePractice;

public record Enemy(String name, int hp){

	@Override
	public String toString() {
		return "Name: " + name + ": " + hp;	
	}
	
}
