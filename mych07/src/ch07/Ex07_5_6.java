package ch07;

class MyPoint{
	int x;
	int y;
}

//class Circle extends Point{
//	int r;
//}

class MyCircle{
	MyPoint p = new MyPoint();
	int r;
}

public class Ex07_5_6 { // 단일 상속(single inheritance) / Object 클래스 - 모든 클래스의 조상
	public static void main(String[] args) {
		
		MyCircle myCircle = new MyCircle();
		
		System.out.println(myCircle.toString()); // MyCircle@1c4af82c
		System.out.println(myCircle); // MyCircle@1c4af82c
	}

}
