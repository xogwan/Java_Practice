package ch04;

public class Ex04_12 { // 임의의 정수만들기 Math.random()
	public static void main(String[] args) {
		int num = 0 ;
		
		for (int i = 0; i < 6; i++) {
			System.out.println((int)(Math.random()*45)+1); // 1~45번까지 랜덤한 숫자 6개 나오게하기
		}
//		for (int i = 0; i < 6; i++) {
//			System.out.println((int)(Math.random()*11)-5);
//		}
		
	}

}
