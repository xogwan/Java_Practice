package ch02;

public class Ex02_12_13 { // printf를 이용한 출력 / print를 이용한 출력 예제
	public static void main(String[] args) {
//		System.out.println(10/3.0);
//		System.out.printf("%.2", 10/3.0);
//		System.out.printf("%d", 10/3);
		
		System.out.printf("%d\n", 15);
		System.out.printf("%o\n", 15);
		System.out.printf("%#x\n", 15);
		System.out.printf("%s\n", Integer.toBinaryString(15));
		
		float f = 123.4567890f;
		System.out.printf("%f\n", f);
		System.out.printf("%e\n", f);
		System.out.printf("%g\n", f);
		
		double d = 123.456789;
		System.out.printf("%f\n", d);
		
		System.out.printf("[%5d]\n", 10);
		System.out.printf("[%-5d]\n", 10);
		System.out.printf("[%05d]\n", 10);
		
		double db = 1.23456789;
		System.out.printf("%f\n", db);
		System.out.printf("%14.10f\n", db);
		
		System.out.printf("[%s]\n", "www.codechobo.com");
		System.out.printf("[%20s]\n", "www.codechobo.com");
		System.out.printf("[%-20s]\n", "www.codechobo.com");
		System.out.printf("[%.10s]\n", "www.codechobo.com");
		
	}
}
