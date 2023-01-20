package ch08;

public class Ex08_4_5_6 { // 예외 처리하기 - try - catch문 / try-catch문에서의 흐름 / 예외의 발생과 catch블럭
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}catch(ArithmeticException ae){
			if(ae instanceof ArithmeticException) {
				System.out.println("true");
			}
			System.out.println("ArithmeticException");
		}catch(Exception e) {
			System.out.println("Exception");
		}
		System.out.println(6);
	}

}
