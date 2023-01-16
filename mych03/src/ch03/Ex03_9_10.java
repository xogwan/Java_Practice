package ch03;

public class Ex03_9_10 { // 사칙연산자 / 산술 변환
	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);
		System.out.printf("%d / %f = %f\n", a, (float)b, a/(float)b);
		
		// 산술 변환
		int x = 1_000_000;
		int y = 2_000_000;
		
		long z = x*y; // int형이라서 오버플로우 발생 -> long으로 형변환 필요
		System.out.println(z);
		
		
	}

}
