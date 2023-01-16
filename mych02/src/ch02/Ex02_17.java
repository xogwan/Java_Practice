package ch02;

public class Ex02_17 { // 타입 간의 변환방법
	public static void main(String[] args) {
		String str = "3";
		
		System.out.println(str.charAt(0)); // 문자 '3' 
		System.out.println(str.charAt(0) - '0'); // 숫자 3
		System.out.println('3' - '0' + 1); // 숫자 4
		System.out.println(Integer.parseInt(str)); // 숫자 3
		System.out.println(str +1); // 문자열 + 숫자 = 문자열 "31"
		System.out.println((char)(3 + '0')); // 문자 '3'
		System.out.println(3 + '0'); // '0'은 숫자로 48, 결과값 : 51
	}

}
