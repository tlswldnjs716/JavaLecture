package homework07;

public class ShapeMain {
	public static void main(String[] args) {
		//Math.random 범위가 0이상 1미만
		int number = (int)(Math.random()*4)+1;
		System.out.println(number);
		if(number == 1 || number == 4) {
			int length = (int)(Math.random()*10)+1;
			if(number ==1) {
				Square newsquare = new Square(length);
				newsquare.Area();
			}
			if(number ==4) {
				Circle newCircle = new Circle(length);
				newCircle.Area();
			}
		}
		if(number == 2 || number == 3) {
			int length1 = (int)(Math.random()*10)+1;
			int length2 = (int)(Math.random()*10)+1;
			if(number ==2) {
				Rectangle newRec = new Rectangle(length1, length2);
				newRec.Area();
			}
			if(number ==3) {
				Triangle newTri = new Triangle(length1, length2);
				newTri.Area();
			}
		}
	}
}
