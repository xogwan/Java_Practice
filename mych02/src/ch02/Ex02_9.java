package ch02;

public class Ex02_9 { // 두 변수의 값 바꾸기
	public static void main(String[] args) {
		int x = 4 , y = 2;
		int tmp;
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x="+ x);
		System.out.println("y=" + y);
	}
}
