package ch02;

public class Ex02_7_8 { // 문자 리터럴과 문자열 리터럴 / 문자열 결합
	public static void main(String[] args) {
		char ch = 'A';
		int i = 'A';
		System.out.println(ch);
		System.out.println(i);
		
		String str = ""; // 빈 문자열(empty string)
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		System.out.println(str);
		System.out.println(""+7+7);
		System.out.println(7+7+"");
		System.out.println(str4);
	}

}
