package ch04;

public class Ex04_13_14 { // for문 / for문 예제
	public static void main(String[] args) {
//		for (int i = 0; i < 3; i++) {
//		System.out.println("Hello World");
//	}
	int sum = 0;
			for (int i = 1; i < 6; i++) {
				sum +=i;
				System.out.printf("1부터 %2d까지의 합 : %2d\n", i, sum);
			}
	}

}
