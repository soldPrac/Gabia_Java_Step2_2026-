package chapter07;

import java.util.Scanner;

public class BankMain_05 {

	public static void main(String[] args) {
		//일산점 031-123-5678
		//종로점 02-852-9856
		
		//이자율 5.3f
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("지점명: ");
		String point = scan.nextLine();
		System.out.print("전화번호: ");
		String tel = scan.nextLine();
		
		Bank bank = new Bank(point, tel);
		System.out.println(point + "지점의 퇴직연금 이자를 입력하세요: ");
		float in = Float.parseFloat(scan.nextLine());
		Bank.interest = in;
		
		bank.getBank();
		System.out.println();
		
		System.out.print("지점명: ");
		point = scan.nextLine();
		System.out.print("전화번호: ");
		tel = scan.nextLine();
		
		Bank bank2 = new Bank(point, tel);
		bank2.getBank();
	}

}
