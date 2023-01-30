package ch09;

public class Ex09_28_29_30_31 { // 문자열을 숫자로 변환하기 / 문자열을 숫자로 변환하기 예제 / 오토박싱&언박싱 / 오토박싱&언박싱 예제
	public static void main(String[] args) {
//		int i = Integer.parseInt("100");
		System.out.println("i="+Integer.parseInt("100"));
		System.out.println("i="+Integer.parseInt("100",10));
		System.out.println("i="+Integer.parseInt("100",2));
		System.out.println("i="+Integer.parseInt("100",8));
		System.out.println("i="+Integer.parseInt("100",16));
	}
}
