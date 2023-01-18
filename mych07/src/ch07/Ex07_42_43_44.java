package ch07;

class AA{
	int i = 100;
	
	class BB{
		void method() {
			System.out.println(i);
		}
	}
}
class CC{}

public class Ex07_42_43_44 { // 내부 클래스(inner class) / 내부 클래스의 종류와 특징 / 내부 클래스의 선언
	public static void main(String[] args) {
		AA a = new AA();
		
	}

}
