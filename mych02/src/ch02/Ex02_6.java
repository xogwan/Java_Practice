package ch02;

public class Ex02_6 { // 리터럴의 타입과 접미사
	public static void main(String[] args) {
		boolean power = true;
		System.out.println(power);
		
		byte b = 127; // byte 범위 = -128 ~ 127
		
		int oct = 010; // 8진수, 10진수로 8
		int hex = 0x10; // 16진수, 10진수로 16
		System.out.println(oct);
		System.out.println(hex);
		
		long l = 100_000_000L;
		
		float f = 3.14f;
		double d = 3.14;
	}
}
