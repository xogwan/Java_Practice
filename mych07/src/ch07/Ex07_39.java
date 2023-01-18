package ch07;

class A{
	public void method(B b) {
		b.method();
	}
}

interface I{
	public void method();
}

class B implements I{
	public void method() {
		System.out.println("B클래스의 메소드");
	}
}

public class Ex07_39 { // 인터페이스의 장점
	public static void main(String[] args) {
		A a = new A();
		a.method(new B());
	}

}
