package chapter08;

import java.util.Scanner;

public class Example_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("기본공격력?: ");
		int baseAtk = Integer.parseInt(scan.nextLine());
		
		System.out.println("전사의 스킬: " + useSkill(new Warrior(), baseAtk));
		System.out.println("마법사의 스킬: " + useSkill(new Mage(), baseAtk));
	}
	
	static int useSkill(Character c, int basePower) {
		return c.attack(basePower);
	}
}
