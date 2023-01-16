package ch05;

import java.util.Arrays;

public class Ex05_6_7 { // 배열의 출력 / 배열의 출력 예제
	public static void main(String[] args) {
//		int[] iArr = {100, 95, 80, 70, 60}; // 길이가 5인 int배열
//		System.out.println(iArr);
//		
//		for (int i = 0; i < iArr.length; i++) {
//			System.out.println(iArr[i]);
//		}
//		
//		System.out.println(Arrays.toString(iArr));
		
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};
		
		for (int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i +1;
			System.out.println("iArr1[" + i + "] : " + iArr1[i]);
		}
		
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10) +1;
			System.out.println("iArr2[" + i + "] : " + iArr2[i]);
		}
		
		System.out.println(chArr);
	}

}
