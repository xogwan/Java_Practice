package ch05;

import java.util.Arrays;

public class Ex05_24 { // Arrays로 배열 다루기
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4}; // 1차원 배열
		int[][]arr2D = {{11,12},{21,22}}; //2차원 배열
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		String[][] str2D = {{"aaa", "bbb"},{"AAA", "BBB"}};
		String[][] str2D2 = {{"aaa", "bbb"},{"AAA", "BBB"}};
		
		System.out.println(Arrays.deepEquals(str2D, str2D2)); // 배열 비교
		
		int[] arr2 = Arrays.copyOf(arr, arr.length); // 배열의 복사
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = {3,2,1,4,0}; // 배열의 정렬
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
	}
}
