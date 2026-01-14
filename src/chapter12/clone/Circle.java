package chapter12.clone;

public class Circle implements Cloneable{
	Point point;
	int radius;
	
	public Circle(int x, int y, int radius) {
		this.radius = radius;
		point = new Point(x, y);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Circle [point=" + point + ", radius=" + radius + "]";
	}
	
	
}
