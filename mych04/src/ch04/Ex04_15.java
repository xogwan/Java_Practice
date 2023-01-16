package ch04;

public class Ex04_15 { // 중첩 for문
	public static void main(String[] args) {
		// 구구단
//		for (int i = 1; i < 10; i++) {
//			for(int j=1; j<10; j++) {
//				System.out.printf("%d * %d = %d\n", i,j, i*j);
//			}
//			System.out.println();
//		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<10 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
