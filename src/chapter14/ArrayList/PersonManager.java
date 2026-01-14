package chapter14.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonManager {
	int select;
	Person p;
	boolean isFind;
	Scanner scan = new Scanner(System.in);
	
	ArrayList<Person> personarr = new ArrayList<>();
	Iterator<Person> iter;
	
	
	public void personMgr() {
		while(true) {
System.out.print("(1)회원가입, (2)정보삭제,(3)정보검색,(4)종료:");
			select = Integer.parseInt(scan.nextLine());
			
			switch (select) {
			case 1:
				p = new Person();
				System.out.print("이름을 입력하세요: ");
				String name = scan.nextLine();
				p.setName(name);
				System.out.print("나이를 입력하세요: ");
				int age = Integer.parseInt(scan.nextLine());
				p.setAge(age);
				System.out.print("전화번호를 입력하세요: ");
				String tel = scan.nextLine();			
				p.setTel(tel);
				personarr.add(p);
				System.out.println("회원가입 완료");				
				break;
			case 2:
				isFind = false;
				System.out.print("삭제할 회원의 이름을 입력하세요: ");
				name = scan.nextLine();
				for(int i = 0; i < personarr.size(); i++) {
					System.out.println("Roop["+ i + "]: personarr.size(): " + personarr.size());
					if(name.equals(personarr.get(i).getName())) {
						personarr.remove(i);
						
					}
				}
//				iter = personarr.iterator();
//				while(iter.hasNext()) {
//					p = iter.next();
//					if(name.equals(p.getName())){
//						iter.remove();
//						System.out.println("삭제 완료!");
//						isFind = true;
//						break;
//					}
//				}
//				if(!isFind) System.out.println("존재하지 않는 회원입니다.");
				break;
			case 3:
				iter = personarr.iterator();
				while(iter.hasNext()) {					
					p = iter.next();
					System.out.println("이름: " + p.getName());
					System.out.println("나이: " + p.getAge());
					System.out.println("전화번호: " + p.getTel());
					System.out.println("=======================");
				}
				break;
			case 4:
				System.out.println("프로그램 종료");
				return;
			default:
				
			}
		}
	}
}
