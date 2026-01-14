package chapter14.comparePractice;

import java.util.Comparator;

public class EnemyHpComparator implements Comparator<Enemy> {
	
	@Override
	public int compare(Enemy e1, Enemy e2) {
		return Integer.compare(e1.hp(), e2.hp());
	}
}
