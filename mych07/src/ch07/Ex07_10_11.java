package ch07;

class SPoint{
	int x;
	int y;
	
	SPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}

class SPoint3D extends SPoint{
	int z;
	
	SPoint3D(int x, int y, int z){
//		this.x = x;
//		this.y = y;
		super(x,y);
		this.z = z;
	}
	String getLocation() {
		return "x : " + x + ", y : " + y + ", z : " + z;
	}
}
public class Ex07_10_11 { // 참조변수 super / super() - 조상의 생성자
	public static void main(String[] args) {
		SPoint3D sPoint3D = new SPoint3D(1, 2, 3);
	}
}
