package chapter14.comparePractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class ComparatorTest_01 {
	public static void main(String[] args) {
		List<Enemy> enemyList = new ArrayList<Enemy>();
		
		enemyList.add(new Enemy("oak", 100));
		enemyList.add(new Enemy("troll", 200));
		enemyList.add(new Enemy("goblin", 50));
		enemyList.add(new Enemy("Skeleton", 80));
		
		Iterator<Enemy> iter = enemyList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());

		}
		
		System.out.println("====이름 정렬====");
		Collections.sort(enemyList, new EnemyNameComparator());
		
		iter = enemyList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("====체력 정렬====");
		Collections.sort(enemyList, new EnemyHpComparator());
		
		iter = enemyList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}
