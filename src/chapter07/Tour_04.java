package chapter07;

import java.util.Scanner;

import chapter08.A_03;

public class Tour_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("관광객 수: ");
		int n = Integer.parseInt(scan.nextLine());
		
		//초기화를 통해서 참조 메모리 확보(Guide의 객체 갯수)
		Guide guide = new Guide(n);
		
		System.out.println();
		System.out.println("관광객 등록");
		
		for(int i = 0; i < n; i++) {
			System.out.print("이름을 입력하세요: ");
			String name = scan.nextLine();
			guide.guest[i].setName(name);
			System.out.print("성별을 입력하세요: ");
			String gender = scan.nextLine();
			guide.guest[i].setGender(gender);
		}
		System.out.println();
		
		while(true) {
			System.out.println("1. 관광객 정보");
			System.out.println("2. 목적지 변경");
			System.out.println("3. 종료");
			System.out.print("선택>> ");
			
			int select = Integer.parseInt(scan.nextLine());
			
			if(select == 1) {
				for(int i = 0; i < guide.guest.length; i++) {
					System.out.println((i+1) + ". 이름: " + guide.guest[i].getName() + ", 성별: "
							+ guide.guest[i].getGender());
				}
				System.out.println();
			}
			else if(select == 2) {
				System.out.print("목적지를 입력하시오: ");
				String point = scan.nextLine();
				Guide.point = point;
				System.out.println("바뀐 목적지: " + guide.point);
				System.out.println();
			}
			else if(select == 3) {
				System.out.println("프로그램 종료");
				break;
			}
			else {
				System.out.println("잘못된 번호입니다");
				System.out.println();
			}
		}
	}

}
