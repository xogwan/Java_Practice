package ch02;

public class Ex02_5 { // 상수와 리터럴
	public static void main(String[] args) {
		int score = 100;
		score = 200;
		final int max = 100; // max는 상수
//		max = 200;  // 에러
		
		System.out.println(score);
		System.out.println(max);
	}
}
