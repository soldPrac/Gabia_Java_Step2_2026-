package chapter14.comparePractice;

import java.util.Comparator;

public class EnemyNameComparator implements Comparator<Enemy> {

	@Override
	public int compare(Enemy e1, Enemy e2) {
		return e1.name().compareToIgnoreCase(e2.name());
	}
}
