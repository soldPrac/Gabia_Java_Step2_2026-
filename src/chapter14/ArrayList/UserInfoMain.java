package chapter14.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UserInfoMain {
	public static void main(String[] args) {
		ArrayList<UserInfo> arr = new ArrayList<UserInfo>();
		Scanner scan = new Scanner(System.in);
		String id = "";
		int pw = 0;
		
		while(true) {
			System.out.print("아이디 생성 (exit 입력시 종료): ");
			id = scan.nextLine();
			if(id.equals("exit")) {
				System.out.println("프로그램이 종료됩니다");
				return;
			}
			System.out.print("패스워드 입력: ");
			pw = Integer.parseInt(scan.nextLine());
			
			UserInfo info = new UserInfo();
			info.setId(id);
			info.setPw(pw);
			arr.add(info);
			Iterator<UserInfo> iter = arr.iterator();
			while(iter.hasNext()) {
				System.out.println(iter.next().toString()); 
			}
			System.out.println("-----------------");
			
			
		}
	}
}
