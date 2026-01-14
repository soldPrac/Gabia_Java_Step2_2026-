package chapter10.MultiInterface;

import java.util.Scanner;
import java.util.HashMap;

public class SchedulerMain_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<Integer, Scheduler> scheduleMap = new HashMap<Integer, Scheduler>();
		scheduleMap.put(82, new RoundRobin());
		scheduleMap.put(76, new LeastJob());
		scheduleMap.put(80, new PriorityAllocation());
		
		Scheduler sc;
		boolean isRun = true;
		
		while (isRun) {
			System.out.println();
			System.out.println("R or r : 한명씩 차례로 할당");
			System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P or p : 업무 skill 값이 높은 상담원에게 할당");
			System.out.println("S or s : 종료");
			System.out.print("전화 상담 방식을 선택하세요 : ");
			
			char input = scan.next().toUpperCase().charAt(0);
			int ch = (int)input;
			
			switch (ch) {
			case 82:
				sc = scheduleMap.get(ch);
				sc.getNextCall();
				break;
			case 76:
				sc = scheduleMap.get(ch);
				sc.getNextCall();
				break;
			case 80:
				sc = scheduleMap.get(ch);
				sc.getNextCall();
				break;
			case 83:
				isRun = false;
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
					
			}
		}		
	}
}
