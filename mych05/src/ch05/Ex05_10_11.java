package ch05;

import java.util.Arrays;
import java.util.Iterator;

public class Ex05_10_11 { // 배열의 활용(3) - 섞기 / 배열의 활용(4) - 로또 번호 만들기
	public static void main(String[] args) {
//		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
//		System.out.println(Arrays.toString(numArr));
//		
//		for (int i = 0; i < 100; i++) {
//			int n = (int)(Math.random()*10);
//			int tmp = numArr[0];
//			numArr[0] = numArr[n];
//			numArr[n] = tmp;
//		}
//		System.out.println(Arrays.toString(numArr));
		int[] ball = new int[45];
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1 ;
		}
		System.out.println(Arrays.toString(ball));
		int tmp = 0;
		int j = 0;
		
		for (int i = 0; i < 6; i++) {
			j = (int)(Math.random()*45);
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
			System.out.println(Arrays.toString(ball));
		}
		for (int i = 0; i < 6; i++) {
			System.out.printf("ball[%d]=%d\n", i, ball[i]);
		}
	}

}
