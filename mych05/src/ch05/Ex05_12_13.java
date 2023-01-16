package ch05;

import java.util.Arrays;

public class Ex05_12_13 { //String배열의 선언과 생성 / String배열의 초기화
	public static void main(String[] args) {
//		String[] name = new String[3];
//		name[0] ="Kim";
//		name[1] ="Park";
//		name[2] ="Lee";
//		String[] name = {"Kim", "Park", "Lee"};
		
		String[] strArr = {"가위","바위","보"};
		System.out.println(Arrays.toString(strArr));
		
		for(int i=0; i<10; i++) {
			int tmp = (int)(Math.random()*3);
			System.out.println(strArr[tmp]);
		}
	}

}
