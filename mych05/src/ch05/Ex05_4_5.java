package ch05;

public class Ex05_4_5 { // 배열의 길이(배열이름, length) / 배열의 초기화
	public static void main(String[] args) {
		int[] arr = new int[5]; // 길이가 5인 int 배열 arr 생성
		int tmp = arr.length; 
		System.out.println(tmp);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]: " + arr[i]);
			
		}
	}
}
