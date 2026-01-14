package chapter08;

import java.util.Scanner;

public class CharacterMain_Ex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Character[] players = {new Warrior(), new Mage()};
		
		System.out.print("기본공격력?: ");
		int baseAtk = Integer.parseInt(scan.nextLine());
		
		for(Character c : players) {
			System.out.println(c.getClass().getSimpleName() + "의 공격력: " + c.attack(baseAtk));
		}
		
	}
}
