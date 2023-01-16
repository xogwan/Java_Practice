package ch07;

class Point{
	int x;
	int y;
}

//class Circle extends Point{
//	int r;
//}

class Circle{
	Point p = new Point();
	int r;
}
public class Ex07_3_4 { // 클래스 간의 관계 - 포함 관계 / 클래스 간의 관계 결정하기
	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.p.x=1;
		c.p.y=2;
		c.r=3;
		System.out.println("c.p.x = " + c.p.x);
		System.out.println("c.p.y = " + c.p.y);
		System.out.println("c.r = " + c.r);
}

}
