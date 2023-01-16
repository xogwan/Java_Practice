package ch07;

class MyPoint3 extends Object{
	int x;
	int y;
//	String getLocation() {
//		return "x:" + x+", y:" + y;
//	}
	public String toString() {
		return "x:" + x+", y:" + y;
	}
}

//class MyPoint3D extends MyPoint3{
//	int z;
//	String getLocation() {
//		return "x:" + x+", y:" + y + ", z:" +z;
//	}
//}

// Object클래스의 toString()을 오버라이딩

public class Ex07_7_8_9 { // 오버라이딩(Overriding) / 오버라이딩의 조건 / 오버로딩 vs 오버라이딩
	public static void main(String[] args) {
//		MyPoint3D myPoint3D = new  MyPoint3D();
//		myPoint3D.x = 3;
//		myPoint3D.y = 5;
//		myPoint3D.z = 7;
//		System.out.println(myPoint3D.getLocation());
		MyPoint3 myPoint3 = new MyPoint3();
		myPoint3.x = 3;
		myPoint3.y = 5;
		System.out.println(myPoint3.toString());
		System.out.println(myPoint3);
		
	}

}
