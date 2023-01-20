package ch08;

public class Ex08_7_8 { // printStackTrace()와 getMessage() / 멀티 catch블럭
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}catch(ArithmeticException ae){
			ae.printStackTrace();
			System.out.println("예외메세지 : " + ae.getMessage());
		}catch(Exception e) {
			System.out.println("Exception");
		}
		System.out.println(6);
		
	}

}
