package homework08;

abstract public class Shape {
	int x;
	int y;
	
	public Shape() {
		
	}
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Shape(int x) {
		this.x = x;
	}
	
	abstract void Area();
}
